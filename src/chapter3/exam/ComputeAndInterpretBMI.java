package chapter3.exam;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds");
        Double weight = input.nextDouble();
        System.out.print("Enter feet:");
        double feet = input.nextDouble();
        System.out.print("enter inch:");
        double inch = input.nextDouble();

        final double KILOGRAM_PER_POUND = .45359237;
        final double METERS_PER_INCH = .0254;

        double weightinKilo = weight*KILOGRAM_PER_POUND;
        double heightinInch = (feet*12 + inch) * METERS_PER_INCH;
        double bmi = weightinKilo /Math.pow(heightinInch,2);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi < 25.0){
            System.out.println("Normal");
        }
        else if (bmi < 30.0){
            System.out.println("OverWeight");
        }
        else {
            System.out.println("obese");
        }
        System.out.println(bmi);
    }
}
