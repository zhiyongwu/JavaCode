package Java.chapter22.exam;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/1/28.
 */
public class TestHashTest {
    public static void main(String[] args) {
        Collection<String> set = new HashSet<>();
        set.add("Beijing");
        set.add("London");
        set.add("New York");

        Iterator<String> i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next().toUpperCase());
        }
        set.remove("Beijing");
        System.out.println(set.size());
    }
}
