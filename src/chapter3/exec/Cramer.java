package chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class Cramer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] d = new Double[6];
        for (int i = 0; i < 6; i++) {
            d[i] = Double.valueOf(scanner.next());
        }
        double ju = d[0]*d[3] - d[1]*d[2];
        if(ju == 0){
            System.out.println("no solution");
        }
        else {
            double x = (d[4]*d[3] -d[1]*d[5])/(ju);
            double y = (d[0]*d[5] -d[4]*d[2])/ju;
            System.out.printf("x is %.1f and y is %.1f",x,y);
        }
    }
}
