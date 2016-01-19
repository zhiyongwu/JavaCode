package chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class Ascii2Unicode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 127: ");
        int n = scanner.nextInt();
        System.out.println((char)n);
    }
}
