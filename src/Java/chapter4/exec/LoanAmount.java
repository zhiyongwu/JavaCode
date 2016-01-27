package Java.chapter4.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/15.
 */
public class LoanAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loan amount");
        int loan = scanner.nextInt();
        System.out.println("Enter Number of years：");
        int yeat = scanner.nextInt();
        System.out.print("Interest Rate    ");
        System.out.print("Monthly Payment    ");
        System.out.println("Total Payment    ");
        for (double i = 5.0/100; i < 8.0/100; i += 1.0/8) {
            System.out.print(i+"    ");
            

        }
    }
}
