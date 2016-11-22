package Java.chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class Immutable {
    private final static Map<String,String> map = new HashMap<>();

    private final String s;

    public Immutable() {
        this.s = "str";
    }

    public static void main(String[] args) {
        map.put("str","this");
        System.out.println(map);
    }
}
