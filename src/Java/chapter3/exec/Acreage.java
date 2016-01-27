package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class Acreage {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the side: ");
        double side = s.nextDouble();
        double area = 3*Math.sqrt(3)/2 * Math.pow(side,2);
        System.out.println("The area of hexagon is: " + area);
    }
}
