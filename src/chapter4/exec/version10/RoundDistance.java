package chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class RoundDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point1(longitude and latitude) in degrees: ");
        double x1 = Math.toRadians(Double.valueOf(input.next()));
        double y1 = Math.toRadians(Double.valueOf(input.next()));
        System.out.print("Enter point2(longitude and latitude in degrees:" );
        double x2 = Math.toRadians(Double.valueOf(input.next()));
        double y2 = Math.toRadians(Double.valueOf(input.next()));
        if(y1 < 0){
            y1 += 360;
        }
        double d = 6371.01 * Math.acos(Math.sin(x1) *Math.sin(x2) + Math.cos(x1)* Math.cos(x2))* Math.cos(y1-y2);

        //FIXME

        System.out.printf("The distance between two points is %f kn",d);
    }
}
