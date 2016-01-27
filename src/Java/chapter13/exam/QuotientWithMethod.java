package Java.chapter13.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/27.
 */
public class QuotientWithMethod {
    private static Scanner scanner = new Scanner(System.in);
    public static int quotient(int num1,int num2){
        if(num2 == 0){
            throw new ArithmeticException("num2 cannot be zero");
        }
        return num1/num2;
    }

    public static void main(String[] args) {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        try {
            System.out.println(quotient(num1,num2));

        }catch (ArithmeticException ex){
            System.err.println(ex.getMessage());
        }
    }
}
