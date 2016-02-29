package Java.chapter2.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class MoneyCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money num");
        int money = scanner.nextInt();
        System.out.println("it is " + money/100 + " dollars and " + money%100 + " cents");
    }
}
