package chapter4.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/15.
 */
public class PrintPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i+1; j--) {
                System.out.print("  ");
            }
            for (int j = i + 1; j > 1 ; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
