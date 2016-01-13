package chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/6.
 */
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder");
        double radius = Double.valueOf(scanner.next());
        double length = Double.valueOf(scanner.next());
        double area = Math.pow(radius,2) * Math.PI;
        double volume = area * length;
        System.out.println("THe area is : " + area);
        System.out.printf("The volume is : %s",volume);
    }
}
class Exe4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a value of feet : ");
        double feet = scanner.nextDouble();
        double meter = 0.305 * feet;
        System.out.printf("%.0f feet is %.2f meters",feet,meter);
    }

}
class PoundToKilo{
    public static void main(String[] args) {
        final double rate = 0.454;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please a number of pounds: ");
        double p = scanner.nextDouble();
        double k = p * rate;
        System.out.print(p + " pounds is " + k + " kilograms");
    }
}

class Grat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter subtotal and gratuity rate: ");
        double sub = Double.valueOf(scanner.next());
        double rate = Double.valueOf(scanner.next());
        double grat = sub * rate/100;
        double total = sub + grat;
        System.out.printf("The grate is %.2f and sub is %.2f",grat,total);
    }
}


class NumSum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please input a number :");
        int num = s.nextInt();
        int sum = 0;
        for (int i = 0; i < String.valueOf(num).length() + 1; i++) {
            int n = num % 10;
            num /= 10;
            sum += n;
        }
        System.out.println(sum);
    }
}