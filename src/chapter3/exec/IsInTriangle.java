package chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class IsInTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x and y of a dot:");
        double x = Double.valueOf(scanner.next());
        double y = Double.valueOf(scanner.next());


        if(x > 0 && x < 200 && y > 0 && y < 100 && x < 200 - 2*y){ //满足x和y之间的约束关系
            System.out.println("IN");
        }else {
            System.out.println("Not in");
        }


    }
}
