package Cralwer.spider;

import Cralwer.bean.SeedUrl;
import Cralwer.config.Config;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

/**
 * Created by Administrator on 2016/2/1.
 */
public class BaseSpider implements Spider {

    private BaseSpider baseSpider = new BaseSpider();


    public static void main(String[] args) {
        BaseSpider spider = new BaseSpider();
        System.out.println(spider.docCrawler("http://www.zhihu.com"));
    }


    @Override
    public Document docCrawler(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).timeout(Config.TIME_OUT).userAgent(Config.USER_AGENT_SPIDER).get();
            System.out.println(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    @Override
    public void docParser(String url) {
        Document doc = baseSpider.docCrawler(url);
        Elements eles = doc.select("div[class=topics]").select("a");
        for (Element ele: eles
             ) {
            SeedUrl seedUrl = new SeedUrl();
            seedUrl.setLink(ele.attr("a"));
            seedUrl.setName(ele.text());
            
        }
    }
}
