package Java.chapter4.exam.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/18.
 */
public class HexDIgit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit");
        String hexString = input.nextLine();
        if(hexString.length() != 1){
            System.out.println("Your must enter exactly one character!");
            System.exit(1);
        }
        char ch = Character.toUpperCase(hexString.charAt(0));
        if(ch <= 'F' && ch >='A'){
            int value = ch - 'A' + 10;
            System.out.println("It is " + value);
        }else if(Character.isDigit(ch)){
            System.out.println("It is " + ch);
        }else {
            System.out.println("Invalid");
        }
    }
}
