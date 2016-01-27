package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class ComputeAns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ,b ,c for a function");
        double a = Double.valueOf(scanner.next());
        double b = Double.valueOf(scanner.next());
        double c = Double.valueOf(scanner.next());


        double ju = Math.pow(b*b - 4*a*c,.5);
        if(ju > 0){
            double root1 = (-b + ju)/(2*a);
            double root2 = (-b - ju)/(2*a);
            System.out.println("has two roots:" + root1 + "and" + root2);
        }
        else if(ju == 0){
            double root = (-b + ju)/(2*a);
            System.out.println("one root :" + root);
        }
        else {
            System.out.println("the equation has no real roots");

        }
    }
}
