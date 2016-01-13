package chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class GuessZeroOrOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter your guess:");
            int num = (int)(Math.random() * 2);
            int guess = scanner.nextInt();
            System.out.println("num is " + num + " and you are "+ (num == guess ? "right":"wrong"));
        }
    }
}
