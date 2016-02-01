package Java.chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/20.
 */
public class IsSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string s1:");
        String s1 = scanner.next();
        System.out.println("Enter String s2: ");
        String s2 = scanner.next();
        if(s2.contains(s1)){
            System.out.println("s1 is a substring of s2");
        }
        else {
            System.out.println("not");
        }
    }
}
