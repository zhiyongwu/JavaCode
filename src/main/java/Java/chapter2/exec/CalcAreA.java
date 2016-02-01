package Java.chapter2.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class CalcAreA {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three poiints of a triangle: ");
        double x1 =Double.valueOf(scanner.next());
        double y1 = Double.valueOf(scanner.next());
        double x2 = Double.valueOf(scanner.next());
        double y2 = Double.valueOf(scanner.next());
        double x3 = Double.valueOf(scanner.next());
        double y3 = Double.valueOf(scanner.next());
        double s1 = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        double s2 = Math.sqrt(Math.pow(x2 - x3,2) + Math.pow(y2 - y3,2));
        double s3 = Math.sqrt(Math.pow(x1 - x3,2) + Math.pow(y1 - y3,2));
        double s = (s1 + s2 + s3)/2;
        double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.printf("The area of the triangle is %.2f",area);
    }

}
