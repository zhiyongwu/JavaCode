package Cralwer.spider;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.util.Cookie;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/17
 */


public class HeiBanCrawler implements Spider {

    private static String URL = "http://www.heibanke.com/lesson/crawler_ex03/";
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.16 Safari/537.36";
    private final int TIME_OUT = 6 * 1_000;
    Map data = new HashMap<>();
    Map cookies = new HashMap<>();
    String passwd = "1";

    @Override
    public Document docCrawler(String url) {
        Document doc = null;
        data.put("username", "zzz");
        data.put("password", passwd);
        data.put("csrfmiddlewaretoken", "0omdhEb47vLvYUqL8t28iqQBOPdGaHEX");
        cookies.put("sessionid", "3phv283e9jk5ktv4utqa6nqrg868jc0o");
        cookies.put("csrftoken", "0omdhEb47vLvYUqL8t28iqQBOPdGaHEX");
        try {
            doc = Jsoup.connect(url).data(data).cookies(cookies).userAgent(USER_AGENT).timeout(TIME_OUT).post();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    @Override
    public void docParser(String url) {
        Document doc = this.docCrawler(url);
        String link = "http://www.heibanke.com" + doc.select("p").select("a[class=btn btn-primary]").attr("href");

        Spider s = new Spider() {

            @Override
            public Document docCrawler(String url) {

                Document doc = null;
                try {
                    WebClient client = new WebClient(BrowserVersion.CHROME);
                    CookieManager cookieMan;
                    cookieMan = client.getCookieManager();
                    cookieMan.addCookie(new Cookie("http://www.heibanke.com", "sessionid", "3phv283e9jk5ktv4utqa6nqrg868jc0o"));
                    cookieMan.addCookie(new Cookie("http://www.heibanke.com", "csrftoken", "0omdhEb47vLvYUqL8t28iqQBOPdGaHEX"));
                    cookieMan.setCookiesEnabled(true);
                    client.setAjaxController(new NicelyResynchronizingAjaxController());
                    client.getOptions().setCssEnabled(false);
                    client.getOptions().setJavaScriptEnabled(true);
                    client.getOptions().setTimeout(TIME_OUT);
                    client.waitForBackgroundJavaScript(10000);
                    client.getOptions().setThrowExceptionOnScriptError(false);
                    HtmlPage page = client.getPage(url);
                    try {
                        TimeUnit.MILLISECONDS.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String html = page.asXml();
                    doc = Jsoup.parse(html);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return doc;
            }

            @Override
            public void docParser(String url) {
                Document doc = this.docCrawler(url);
                System.out.println(doc);
            }
        };
        s.docParser(link);
    }

    public static void main(String[] args) {
        new HeiBanCrawler().docParser(URL);
    }
}
