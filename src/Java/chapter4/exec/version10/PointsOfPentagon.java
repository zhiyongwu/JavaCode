package Java.chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class PointsOfPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double x1 = 0;
        double y1 = radius;

        double x2 = radius*Math.cos(Math.PI/5);
        double y2 = radius*Math.sin(Math.PI/5);

        double x3 = radius*Math.cos(Math.PI*2/5);
        double y3 = radius*Math.sin(Math.PI*2/5);

        double x4 = radius* Math.cos(Math.PI*3/5);
        double y4 = radius*Math.sin(Math.PI*3/5);
        double x5 = radius*Math.cos(Math.PI*4/5);
        double y5 = radius*Math.sin(Math.PI*4/5);

        System.out.printf("The five points are(%f,%f)\n(%f,%f)\n(%f,%f)\n(%f,%f)\n(%f,%f)",x1,y1,x2,y2,x3,y3,x4,y4,x5,y5);
    }
}
