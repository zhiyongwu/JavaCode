package setp.collections;

import java.util.ArrayList;

/**
 * Created by wuzhiyong on 2016/6/24
 */
public class ApplesAndOrangeWithGenerics {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (Object a:apples
             ) {
            System.out.println(a);
        }
    }
}
class Orange{}

class Apple{
    private static long counter;
    private final long id = counter ++;

    public long getId() {
        return id;
    }
}