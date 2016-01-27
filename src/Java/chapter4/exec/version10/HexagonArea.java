package Java.chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double side = input.nextDouble();
        double area = (6* Math.pow(side,2))/(4* Math.tan(Math.PI/6));
        System.out.printf("Area of hexagon is %-4.2f",area);
    }
}
