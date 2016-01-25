package Java.chapter4.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess");
        int number = (int)(Math.random()*100);
        System.out.println();
        int guess = -1;
        while (guess != number){
            guess = scanner.nextInt();
            if(guess == number){
                System.out.println("you are wright,number is " + guess);
            }else if(guess > number){
                System.out.println("too high");
            }else System.out.printf("too low");
        }
    }
}
