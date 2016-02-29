package Cralwer.spider;

import Cralwer.bean.SeedUrl;
import Cralwer.bean.Topic;
import Cralwer.config.Config;
import Cralwer.helper.DatabaseHelper;
import Cralwer.util.BeanUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.util.List;

/**
 * Created by Administrator on 2016/2/2.
 */
public class TopQASpider implements Spider{
    @Override
    public Document docCrawler(String url){
        Document doc = null;

        try {
            doc = Jsoup.connect(url.replace("questions","top-answers")).userAgent(Config.USER_AGENT_CHROME).timeout(Config.TIME_OUT).get();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return doc;
    }


    @Override
    public void docParser(String url){
        TopQASpider sp = new TopQASpider();
        Document doc = null;
        try {
            doc = sp.docCrawler(url);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        if(doc == null){
            return;
        }
        Elements eles = doc.select("div[class=feed-main]");
        Topic topic = new Topic();
        for (Element ele:eles
             ) {
            topic.setBaselink(url);
            topic.setTitle(ele.select("h2").select("a").text());
            topic.setLink("http://www.zhihu.com" + ele.select("h2").select("a").attr("href"));
            topic.setAcount(Integer.valueOf(ele.select("div[class=zm-item-vote]").select("a").attr("data-votecount")));
            topic.setAuthor(ele.select("div[class=zm-item-answer-author-info]").select("a").text());
            topic.setDescr(ele.select("div[class=zm-item-answer-author-info]").select("span").attr("title"));
            topic.setAuthorlink("http://www.zhihu.com" + (ele.select("div[class=zm-item-answer-author-info]").select("a[class=author-link]").attr("href")));
            DatabaseHelper.insertEntity(Topic.class, BeanUtil.transBean2Map(topic));

        }
    }


    public static void main(String[] args) throws Exception{
        List<SeedUrl> list = DatabaseHelper.queryEntityList(SeedUrl.class,"select * from seedUrl");
        TopQASpider top = new TopQASpider();
        for (SeedUrl seed:list
             ) {
            for (int i = 1; i < 10; i++) {
                try {
                    top.docParser(seed.getLink() + "?page=" + i);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
