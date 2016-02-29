package Java.chapter3.exam;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class SimpleIfDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int in = scanner.nextInt();
        if(in%5 == 0){
            System.out.println("HiFive");
        }
        if(in%2 == 0){
            System.out.println("HiEven");
        }
    }
}
