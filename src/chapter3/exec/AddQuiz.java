package chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class AddQuiz {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) (Math.random() * 10);


        Scanner scanner = new Scanner(System.in);
        System.out.printf("%d+%d+%d=:", num1, num2, num3);
        int ans = scanner.nextInt();
        System.out.printf("%d+%d+%d=%s", num1, num2, num3, num1 + num2 + num3 == ans ? ans + "  right" : num1 + num2 + num3 + " sorry you are wrong");
    }
}
