package chapter3.exam;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class TheBooleanOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = scanner.nextInt();
        if(a %2 == 0 && a %3 == 0){
            System.out.println(a + " is divisible by 2 and 3");
        }
        if(a%2 == 0 || a %3 ==0){
            System.out.println(a + " is divisible by 2 or 3");
        }
        if(a %2 ==0 ^ a%3 == 0){
            System.out.println(a + " is divisible by 2 or 3,but not both");
        }
    }
}
