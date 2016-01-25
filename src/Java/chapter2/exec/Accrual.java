package Java.chapter2.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class Accrual {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter balance and interest rate(e..g., 3 for 3%) : ");
        double balance = Double.valueOf(scanner.next());
        double rate = Double.valueOf(scanner.next());
        double interest = balance * rate /1200;
        System.out.println(interest);
    }
}
