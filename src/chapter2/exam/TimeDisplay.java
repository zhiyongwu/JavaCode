package chapter2.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2015/12/30.
 */
public class TimeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please a number of second");
        int s = scanner.nextInt();
        int minutes = s / 60;
        int seconds = s % 60;
        System.out.printf("%d分%d秒",minutes,seconds);
    }
}
