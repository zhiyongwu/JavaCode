package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 and y1:");
        double x1 = Double.valueOf(scanner.next());
        double y1 = Double.valueOf(scanner.next());
        System.out.print("Enter x2 and y2:");
        double x2 = Double.valueOf(scanner.next());
        double y2 = Double.valueOf(scanner.next());
        double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("The distance is " + distance);
    }
}
