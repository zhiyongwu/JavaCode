package Chapter6.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/20.
 */
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (e.g. 2012): ");
        int year = scanner.nextInt();

        System.out.print("Enter a month bewteen 1 and 12: ");
        int month = scanner.nextInt();
        if(month < 0 || month > 13){
            System.out.println("Invalid Month");
            System.exit(1);
        }

        printMonth(year,month);
    }

    public static void printMonth(int year,int month){
        printTitle(year,month);
        printBody(year,month);
    }

    public static void printTitle(int year,int month){
        System.out.println("             " + getMonthName(month) + "" + year);
        System.out.println("----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printBody(int year,int month){
        int startDay = getStartDay(year,month);
        int numberOfDaysInMonth = getNumberOfDaysinMonth(year,month);
        int i = 0;
        for (i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d",i);
            if((i + startDay)%7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public static String getMonthName(int month){
        String monthName = "";
        switch (month){
            case 1:monthName = "Jan";break;
            case 2:monthName = "Feb";break;
            case 3:monthName = "Mar";break;
            case 4:monthName = "Apr";break;
            case 5:monthName = "May";break;
            case 6:monthName = "Jun";break;
            case 7:monthName = "Jul";break;
            case 8:monthName = "Aug";break;
            case 9:monthName = "Sep";break;
            case 10:monthName = "Oct";break;
            case 11:monthName = "Nov";break;
            case 12:monthName = "Dec";break;
        }
        return monthName;
    }

    public static int getStartDay(int year,int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays =getTotalNumberofDays(year,month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberofDays(int year ,int month){
        int total = 0;
        for (int i = 1800; i < year; i++) {
            if(isLeapYear(i)){
                total += 366;
            }else total += 365;
        }
        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysinMonth(year,i);
        }
        return total;
    }

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }



    public static int getNumberOfDaysinMonth(int year,int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }
        if(month == 2){
            return isLeapYear(year) ? 29:28;
        }
        return 0;
    }


}
