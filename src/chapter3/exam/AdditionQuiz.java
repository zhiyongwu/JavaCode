package chapter3.exam;

import java.util.Random;

/**
 * Created by wuzhiyong on 15/12/30.
 */
public class AdditionQuiz {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(System.currentTimeMillis()%10);
            Thread.sleep(new Random(47).nextInt(100));
        }
    }
}
