package Java.chapter2.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class InvestAmount {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter invest amount : ");
        Double amount = s.nextDouble();
        System.out.println("Enter annual interest rate in percentage :");
        double rate = s.nextDouble();
        System.out.println("Enter number of years:");
        int year = s.nextInt();
        double value = amount * Math.pow((1 + rate/100/12),year*12);
        System.out.println(value);
    }

}
