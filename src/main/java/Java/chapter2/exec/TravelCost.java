package Java.chapter2.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class TravelCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance : ");
        double distance = scanner.nextDouble();
        System.out.println("Enter miles per gallon : ");
        double miles = scanner.nextDouble();
        System.out.println("Enter price per gallon : ");
        double price = scanner.nextDouble();
        double cost = distance / miles * price;
        System.out.println("price is " + cost);
    }
}
