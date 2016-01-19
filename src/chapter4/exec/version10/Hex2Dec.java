package chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n > 16 || n < 0){
            System.out.println("Invalid number");
            System.exit(1);
        }

        if(n < 10){
            System.out.println("The hex number is "+ n);
        }
        else {
            System.out.println("The hex number is " + (char)(n-10+'A'));
        }
    }
}
