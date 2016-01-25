package Java.chapter3.exam;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottery = (int)(Math.random()*100);

        System.out.println("Enter your guess");
        int l1 = lottery/10;
        int l2 = lottery%10;

        int guess = scanner.nextInt();

        int g1 = guess/10;
        int g2  =guess%10;

        System.out.println(lottery);
        if(lottery == guess){
            System.out.println("10000");
        }
        else if(l1 == g2 && l2 == g1){
            System.out.println("3k");
        }
        else if(l1 == g1 || l2 == g2 || l1 == g2 || l2 == g1){
            System.out.println("1k");
        }
        else {
            System.out.println("sorry");
        }
    }
}
