package chapter3.exam;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);

        if(num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("what is " + num1 + "-" + num2 + "=" );
        int ans = s.nextInt();
        if(num1 + num2 == ans){
            System.out.println("right");
        }
        else {
            System.out.println(num1 + "-" + num2  + "should be:" + (num1 - num2));
        }
    }
}
