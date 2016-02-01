package Java.chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class LetterToGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade:");
        char ch = scanner.next().charAt(0);
        if(ch < 'A' || ch > 'F' || ch == 'E'){
            System.out.println("Invalid grade");
            System.exit(1);
        }
        else {
            switch (ch){
                case 'A':
                    System.out.println( ch + " is 4");break;
                case 'B':
                    System.out.println(ch + " is 3");break;
                case 'C':
                    System.out.println(ch + " is 2");break;
                case 'D':
                    System.out.println(ch + " is 1");break;
                case 'F':
                    System.out.println(ch + " is 0");break;
            }
        }
    }
}
