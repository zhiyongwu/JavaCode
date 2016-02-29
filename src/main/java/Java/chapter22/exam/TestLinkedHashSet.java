package Java.chapter22.exam;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/1/28.
 */
public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Beijing");
        set.add("London");
        set.add("New York");
        set.add("LA");

        for (String s:set
             ) {
            System.out.println(s.toUpperCase());
        }
    }
}
