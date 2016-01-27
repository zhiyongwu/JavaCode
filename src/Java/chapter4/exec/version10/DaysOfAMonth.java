package Java.chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class DaysOfAMonth {

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int daysOfMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a month: ");
        String month = scanner.next();
        int days = 0;
        switch (month){
            case "Jan":days = 31;break;
            case "Feb":if (isLeapYear(year)){
                days = 29;break;
            }else {
                days = 28;break;
            }
            case "Mar":days = 31;break;
            case "Apr":days = 30;break;
            case "May":days = 31;break;
            case "Jun":days = 30;break;
            case "Jul":days = 31;break;
            case "Aug":days = 31;break;
            case "Sep":days = 30;break;
            case "Oct":days = 31;break;
            case "Nov":days = 30;break;
            case "Dec":days = 31;break;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println(daysOfMonth());
    }
}
