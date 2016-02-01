package Cralwer.spider;

import org.jsoup.nodes.Document;

/**
 * Created by Administrator on 2016/2/1.
 */
public interface Spider {
    Document docCrawler(String url);
    void docParser(String url);
}
