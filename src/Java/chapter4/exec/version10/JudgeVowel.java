package Java.chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class JudgeVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().toCharArray()[0];
        ch = Character.toLowerCase(ch);
        if(ch < 'A' || ch > 'z'){
            System.out.println("Invalid");
            System.exit(1);
        }
        switch (ch){
            case 'a':
                System.out.println(ch + " is vowel");break;
            case 'e': System.out.println(ch + " is vowel");break;
            case 'i': System.out.println(ch + " is vowel");break;
            case 'o': System.out.println(ch + " is vowel");break;
            case 'u': System.out.println(ch + " is vowel");break;
            default:
                System.out.println(ch + " is a consonant");
        }
    }
}
