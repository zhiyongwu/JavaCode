package chapter4.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class SubtractionQuizLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMBER_OF_QUISTIONSS = 5;
        int count = 0;
        int correctCount = 0;
        long currentime = System.currentTimeMillis();
        while (count < NUMBER_OF_QUISTIONSS){
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);

            if(num1 > num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("Enter the andswer of " + num1 + "+" + num2 + " :");
            int ans = scanner.nextInt();
            if(ans == num1+num2){
                System.out.println("You are right!");
                correctCount++;
            }else {
                System.out.printf("You are wrong!");
            }
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("spent " + (end - currentime)/1000 + " secs\n" + correctCount  + " is correct");
    }
}
