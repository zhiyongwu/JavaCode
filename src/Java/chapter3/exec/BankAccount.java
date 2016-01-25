package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/4.
 */


public class BankAccount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Input your Account number:");
        double myNum = s.nextDouble();
        double oriNum = myNum;
        double totalNum = 0;
        for (int i = 0; i < 6; i++) {
            totalNum = myNum * (1+0.00417);
            myNum = totalNum + oriNum;
        }
        System.out.println(totalNum);
    }
}
