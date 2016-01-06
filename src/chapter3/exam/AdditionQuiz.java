package chapter3.exam;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by wuzhiyong on 15/12/30.
 */
public class AdditionQuiz {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(System.currentTimeMillis()%10);
//            Thread.sleep(new Random(47).nextInt(100));
//        }
        int number2 = (int)System.currentTimeMillis()/7%10;
        System.out.println(number1);
        System.out.printf("please enter the answer of %d + %d=" ,number1,number2);
        int answer = s.nextInt();
        System.out.println(number1 + "+" + number2 + "=" + (number1 + number2 == answer?"correct":"false"));
    }

}
