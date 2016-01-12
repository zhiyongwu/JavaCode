package chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class isDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer num = scanner.nextInt();
        System.out.println("Is " + num + "divisible by 5 and 6 ?" + (num % 5 == 0 && num % 6 == 0 ? "true" :"false"));
        System.out.println("Is " + num + "divisible by 5 or 6?" + (num % 5 == 0 || num % 6 == 0 ? "true" :"false"));
        System.out.println("Is " + num + "divisible by 5 or 6,but not both?" + (num % 5 == 0 ^ num % 6 == 0 ? "true" :"false"));
    }
}
