package chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class DaysOFMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        System.out.println("Enter the month");
        int month = scanner.nextInt();
        if(month < 1 || month > 12){
            System.out.println("error month!");
        }else {
            switch (month){
                case 1:
                    System.out.println(year + " Jan"  + "has 31days");break;
                case 2:
                    if(isLeapYear(year)){
                        System.out.println(year + " 2 has 29 days");
                    }
                    else {
                        System.out.println(year + " 2 has 28days");
                    }
                    break;
                case 3:
                    System.out.printf(year + " 3 has 31 days");break;
                case 4:
                    System.out.println(year + " 4 has 30 days");break;
                case 5:
                    System.out.println(year + " 5 has 31 days");break;
                case 6:
                    System.out.println(year + " 6 has 30 days");break;
                case 7:
                    System.out.println(year + " 7 has 31 days");break;
                case 8:
                    System.out.println(year + " 8 has 31days");break;
                case 9:
                    System.out.println(year + " 9 has 30 days");break;
                case 10:
                    System.out.println(year + " 10 has 31 days");break;
                case 11:
                    System.out.println(year + " 11 has 30 days");break;
                case 12:
                    System.out.println(year + " 12 has 31 days");
            }
        }
    }

    public static boolean isLeapYear(int year){
        if((year %4 == 0 && year % 100 != 0) || year%400 == 0){
            return true;
        }
        else return false;
    }
}
