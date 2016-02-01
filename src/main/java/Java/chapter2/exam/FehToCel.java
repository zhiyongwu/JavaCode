package Java.chapter2.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2015/12/30.
 */
public class FehToCel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Feh Degree");
        int feh = scanner.nextInt();
        double cel = (5.0/9)*(feh -32);
        System.out.println(cel);
    }
}
