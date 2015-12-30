package chapter2.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2015/12/30.
 */
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        double area = 0.0;
        System.out.println("please input radius");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        area = radius*radius*Math.PI;
        System.out.println(area);
    }

}
