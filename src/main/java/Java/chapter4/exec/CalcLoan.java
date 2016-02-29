package Java.chapter4.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/15.
 */
public class CalcLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loanL:");
        double loan = scanner.nextDouble();
        System.out.println("Enter rate :");
        double rate = scanner.nextDouble();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        double total = 0;
        for (int i = 0; i <month; i++) {
            total = (total +loan)*(1 + rate/100/12);

        }
        System.out.println(total);
    }
}
