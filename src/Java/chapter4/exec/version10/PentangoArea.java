package Java.chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class PentangoArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();
        double s = 2 * length *Math.sin(Math.PI/5);
        double area = 5 * Math.pow(s,2)/(4*Math.tan(Math.PI/5));
        System.out.printf("The area of the pentagon is %4.2f",area);
    }
}
