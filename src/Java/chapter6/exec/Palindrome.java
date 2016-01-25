package Java.chapter6.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/20.
 */
public class Palindrome {
    public static int reserve(int number){
        int re = 0;
        do {
            int temp = number % 10;
            re = re*10 + temp;
            number = number / 10;

        }while (number != 0);
        return  re;
    }

    public static boolean isPalindrome(int number){
        return reserve(number) == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int num = scanner.nextInt();
        if(isPalindrome(num)){
            System.out.println("Yes");
        }
        else System.out.println("NO");
//        System.out.println(reserve(1234521));
    }
}
