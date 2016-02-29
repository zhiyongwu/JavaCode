package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class CalcBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter the height in inches: ");
        double height = scanner.nextDouble();
        double BMI = weight*0.45359237/Math.pow(height * 0.0254,2);
        System.out.println("BMI is " + BMI);
    }
}
