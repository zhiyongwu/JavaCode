package Java.chapter21.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/1/28.
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("ss");
        String s = list.get(0);
        Iterator i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
