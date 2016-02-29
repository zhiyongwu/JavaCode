package Java.chapter2.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class Chill {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the temperature in F between -58F and 41 F: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double wind = scanner.nextDouble();
        double chill = 35.74  + .6215 * temperature -35.75 * Math.pow(wind,.16) + .4275 * temperature * Math.pow(wind,.16);
        System.out.println("The wind chill index is " + chill);
    }
}
