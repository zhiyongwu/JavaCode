package chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class ISBNCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first nine numbers of ISBN:");
        String s = scanner.next();
        String[] nums = s.split("");
        int sum = 0;
        for (int i = 0;i < nums.length;i++
             ) {
            double d = Double.valueOf(nums[i]);
            sum += (i+1)*d;
        }
        if(sum%11 == 10){
            System.out.println("ISBN is " + s + "X");
        }
        else System.out.println("ISBN is " + s + sum%11);
    }
}
