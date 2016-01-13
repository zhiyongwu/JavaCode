package chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class LittleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            int num = (int)(Math.random()*3);
            System.out.println(num);
            System.out.println("Enter a number 0,1 OR 2");
            int guess = scanner.nextInt();
            if(guess > 3 || guess < 0){
                System.out.println("wrong number");
                System.exit(1);
            }
            if(guess > num){
                System.out.println("you win");
            }
            else if(guess < num){
                System.out.println("you lose");
            }else {
                System.out.println("even");
            }
        }

    }
}
