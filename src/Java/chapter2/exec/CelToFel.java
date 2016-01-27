package Java.chapter2.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2015/12/30.
 */
public class CelToFel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the degree");
        double degree = input.nextDouble();
        double fel = (9.0/5) * degree + 32;
        System.out.println(fel);
    }
}
