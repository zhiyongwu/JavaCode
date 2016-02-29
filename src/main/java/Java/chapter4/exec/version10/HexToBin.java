package Java.chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class HexToBin {
    public static void main(String[] args) {
        System.out.print("Enter a hex digit: ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().toCharArray()[0];
        if(ch < '0' || ch > 'F'){
            System.out.println("Invalid");
            System.exit(1);
        }
        else {
            int n = 0;
            if(ch >= 'A'){
                n = ch - 'A' + 10;

            }else {
                n = ch - '0';
            }
            System.out.println(Integer.toBinaryString(n));
        }
    }
}
