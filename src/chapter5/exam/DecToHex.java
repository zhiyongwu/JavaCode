package chapter5.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/20.
 */
public class DecToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String hex = "";
        while (decimal != 0){
            int hexValue = decimal %16;
            decimal /= 16;
            char hexDigit = hexValue > 0 && hexValue <= 9?(char)(hexValue+'0'):(char)(hexValue-10+'A');
            hex = hexDigit + hex;
        }
        System.out.println(hex);
    }
}
