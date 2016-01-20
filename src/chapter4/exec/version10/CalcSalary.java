package chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/20.
 */
public class CalcSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = scanner.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = Double.valueOf(scanner.next());
        System.out.print("Enter hourly pay rate: ");
        double payRate = Double.valueOf(scanner.next());
        System.out.print("Enter federal tax rate: ");
        double fRate = Double.valueOf(scanner.next());
        System.out.print("Enter state tax rate: ");
        double sRate = Double.valueOf(scanner.next());
        System.out.println(name);
        System.out.println(hours);
        System.out.println(hours * payRate);
        System.out.println(hours * payRate * fRate);
        System.out.println(hours * payRate * sRate);
    }
}
