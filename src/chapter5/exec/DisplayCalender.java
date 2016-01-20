package chapter5.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/20.
 */
public class DisplayCalender {
    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printTitle(int year,int month){
        System.out.println("             " + getNameOfTHeMonth(month));
        System.out.println("------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
    }
    public static String getNameOfTHeMonth(int month){
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
            case 12:monthName = "Nov";break;
        }
        return monthName;
    }

    public static void printBody(int year,int month){
        int startDay = getStartDay(year,month);
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= daysInMonth(year,month); i++) {
            System.out.printf("%4d",i);
            if((i+startDay) %7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
//        System.out.print("Enter month: ");
//        int month = scanner.nextInt();
//        if(month < 1 || month > 12){
//            System.out.println("Invalid Month!");
//            System.exit(1);
//        }
        for (int i = 1; i <= 12; i++) {
            printTitle(year,i);
            printBody(year,i);
        }


    }

    public static int daysInMonth(int year,int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month ==8 || month == 10|| month == 12){
            return 31;
        }if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }
        if(month == 2){
            return isLeapYear(year)?29:28;
        }
        return 0;
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
        for (int i = 0; i < month; i++) {
            total +=daysInMonth(year,i);
        }
        return total;
    }


}
