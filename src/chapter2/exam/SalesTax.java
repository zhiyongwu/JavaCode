package chapter2.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2015/12/30.
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input thie Amount");
        double Amount = scanner.nextDouble();
        double taxAmount = Amount * 0.06;
        System.out.printf("%.2f",taxAmount*100/100.0);
    }
}
