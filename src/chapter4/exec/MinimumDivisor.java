package chapter4.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/15.
 */
public class MinimumDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = Integer.valueOf(scanner.next());

        for (int i = 2;;) {
            if(num % i == 0){
                System.out.print(" " + i);
                num /= i;
                if(num == 1){
                    break;
                }
            }
            else {
                i++;
            }
        }
    }
}
