package Java.chapter4.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/13.
 */
public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        int sum = 0;
        System.out.println("Enter a number (if 0 exits)");
        do {
            input = scanner.nextInt();
            sum += input;
        }while (input != 0);
        System.out.println(sum);
    }
}
