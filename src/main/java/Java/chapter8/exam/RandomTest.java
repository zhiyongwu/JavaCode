package Java.chapter8.exam;

import java.util.Random;

/**
 * Created by Administrator on 2016/1/26.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random(47);
        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt(2));
        }
    }
}
