package Cralwer.spider;

import Cralwer.bean.SeedUrl;
import Cralwer.config.Config;
import Cralwer.helper.DatabaseHelper;
import Cralwer.util.BeanUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

/**
 * Created by Administrator on 2016/2/1.
 */
public class BaseSpider implements Spider {


    public static void main(String[] args) {
        BaseSpider spider = new BaseSpider();
        spider.docParser("http://www.zhihu.com");
    }


    @Override
    public Document docCrawler(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).timeout(Config.TIME_OUT).userAgent(Config.USER_AGENT_SPIDER).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    @Override
    public void docParser(String url) {
        BaseSpider baseSpider = new BaseSpider();
        Document doc = baseSpider.docCrawler(url);
        Elements eles = doc.select("div[class=topics]").select("a");
        for (Element ele: eles
             ) {
            SeedUrl seedUrl = new SeedUrl();
            seedUrl.setLink(ele.attr("a"));
            seedUrl.setName(ele.text());
            DatabaseHelper.insertEntity(SeedUrl.class, BeanUtil.transBean2Map(seedUrl));
        }
    }


}
