package chapter4.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class SentinelValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (exits if 0)");
        int input = scanner.nextInt();
        int sum = 0;
        while (input != 0){
            sum += input;
            input = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
