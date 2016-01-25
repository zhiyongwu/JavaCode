package Java.chapter5.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/20.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string");
        String s = scanner.next();
        int low = 0;
        int high = s.length() - 1;
        boolean isPalindrome = false;
        while (low < high){
            if(s.charAt(low) != s.charAt(high)){
                isPalindrome = false;
                break;
            }else {
                isPalindrome = true;
                low++;
                high--;
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }
    }
}
