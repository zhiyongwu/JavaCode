package chapter2.exec;

import java.util.Scanner;

import static chapter2.exec.CalculateVol.method2;

/**
 * Created by Administrator on 2015/12/30.
 */
public class CalculateVol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input the radius");
        double radius = s.nextDouble();
        System.out.println("Please input the height");
        double height = s.nextDouble();
        double mianJi = Math.pow(radius,2)*Math.PI;
        double Vol = mianJi *height;
        System.out.println(mianJi + "===" + Vol);

        
    }




    public static void method2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please input the radius and height");
        String input = s.next();
        String height = s.next();
        double radius = Double.parseDouble(input);
        double mianJi = Math.pow(radius,2)*Math.PI;
        double Vol = mianJi *Double.parseDouble(height);
        System.out.println(mianJi + "===" + Vol);

    }
}

class Test{
    public static void main(String[] args) {
        method2();
    }
}