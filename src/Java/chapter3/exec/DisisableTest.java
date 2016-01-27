package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class DisisableTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if(num % 5 == 0 && num %6 == 0){
            System.out.println(num + " is divisible by both 5 and 6");
        }
        else if(num % 5 != 0 && num % 6 != 0){
            System.out.println(num + " is not divisible by 5 or 6");
        }
        else if(num % 5 == 0 ^ num % 6 ==0){
            System.out.println(num + " is divisible by 5 or 6,but not both");
        }

        boolean a= true;
        boolean b =true;
        System.out.println(!(a&&b) == (!a||!b));
    }
}
