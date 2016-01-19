package chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class LetterToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = scanner.next().charAt(0);
        if(ch > 'z' || ch < 'A'){
            System.out.println("Invalid input !");
            System.exit(1);
        }
        else {
            ch = Character.toLowerCase(ch);
            if(ch < 'd'){
                System.out.println(2);
            }else if(ch < 'g'){
                System.out.println(3);
            }else if(ch < 'j'){
                System.out.println(4);
            }
            else if(ch < 'm'){
                System.out.println(5);
            }else if(ch < 'p'){
                System.out.println(6);
            }else if(ch < 't'){
                System.out.println(7);
            }else if(ch < 'w'){
                System.out.println(8);
            }else System.out.println(9);
        }
    }
}
