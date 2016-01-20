package chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/20.
 */
public class SSNCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your SSN number: ");
        String ssn = scanner.next();
        if(ssn.length() != 11){
            System.out.println("Invalid SSN number");
            System.exit(1);
        }
        if(ssn.charAt(3) == '-' && ssn.charAt(6) == '-'){
            for (int i = 0; i < 11; i++) {
                if(i != 3 && i != 6){
                    if(ssn.charAt(i) > '9' || ssn.charAt(i) < '0'){
                        System.out.println("Invalid SSN number");
                        System.exit(1);
                    }
                }
            }
            System.out.println("valid SSN number");
        }else {
            System.out.println("Invalid input!");
            System.exit(1);
        }
    }
}
