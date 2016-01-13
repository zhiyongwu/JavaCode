package chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class TwoRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x-y and radius of circle1: ");
        double x1 = Double.valueOf(scanner.next());
        double y1 = Double.valueOf(scanner.next());
        double radius1 = Double.valueOf(scanner.next());

        System.out.printf("Enter x-y and radius of circle2: ");
        double x2 = Double.valueOf(scanner.next());
        double y2 = Double.valueOf(scanner.next());
        double radius2 = Double.valueOf(scanner.next());

        double distance = radius1 - radius2 > 0? radius1 - radius2 :radius2 - radius1;
        double length = Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
        if(length < distance){
            System.out.println("IN");
        }
        else System.out.println("OUT");

    }
}
