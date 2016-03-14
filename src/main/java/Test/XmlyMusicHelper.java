package Test;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class XmlyMusicHelper implements Cralwer {

    private static final int TIME_OUT = 6 * 1_000;
    private static String BASE_URL = "http://www.ximalaya.com/";
    public static final int TYPE_EXACT = 0;
    public static final int TYPE_INDISTINCT = 1;

    public static String getM4aUrl(String param, int type) {
        XmlyMusicHelper h = new XmlyMusicHelper();
        String id = h.parse(param, type);
        return h.getMusicUrl(id);
    }

    private XmlyMusicHelper() {

    }

    @Override
    public Document get(String param, int type) {
        String url = null;
        Document doc = null;
        switch (type) {
            case TYPE_INDISTINCT:
                try {
                    url = BASE_URL + "tag/" + URLEncoder.encode(param, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                break;
            case TYPE_EXACT:
                try {
                    url = BASE_URL + "search/" + URLEncoder.encode(param, "UTF-8") + "/t2c6s2";
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                break;
            default:
                return null;
        }
        try {
            doc = Jsoup.connect(url).timeout(TIME_OUT).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    @Override
    public String parse(String param, int type) {
        Document doc = this.get(param, type);
        Element ele;
        String result;
        switch (type) {
            case TYPE_INDISTINCT:
                ele = doc.select("ul[class=feedList]").first();
                String ids = ele.attr("sound_ids");
                if (ids.equals("")) {
                    return null;
                }
                result = ids.split(",")[0];
                break;
            case TYPE_EXACT:
                ele = doc.select("div[class=col soundReport_operate]").select("a").first();
                String id = ele.attr("track_id");
                if (id.equals("")) {
                    return null;
                }
                result = id;
                break;
            default:
                return null;
        }
        return result;
    }

    private String getMusicUrl(String id) {
        final String TRACK_URL = "http://www.ximalaya.com/tracks/";
        String result = "";
        try {
            URL url = new URL(TRACK_URL + id + ".json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(TIME_OUT);
            conn.setDoInput(true);
            conn.connect();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                result += line;
            }
            JSONObject obj = new JSONObject(result);
            result = obj.getString("play_path_64");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}

interface Cralwer {
    Document get(String param, int type);

    String parse(String param, int type);
}


class Test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(XmlyMusicHelper.getM4aUrl("小苹果", XmlyMusicHelper.TYPE_EXACT));
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        System.out.println(XmlyMusicHelper.getM4aUrl("童谣", XmlyMusicHelper.TYPE_INDISTINCT));
        System.out.println(System.currentTimeMillis() - start);
    }
}
