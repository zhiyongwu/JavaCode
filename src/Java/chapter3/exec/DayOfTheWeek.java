package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter month(1-12)");
        int month = scanner.nextInt();
        if(month == 1|| month == 2){
            month += 12;
            year -= 1;
        }
        int j = year / 100;
        int k = year % 100;
        System.out.println("Enter day of the month:");
        int q = scanner.nextInt();
        int h = (q + 26*(month+1)/10 + k + k/4 + j/4 + 5*j)%7;
        String day = "";
            switch(h){
                case 0: day = "Saturday";break;
                case 1: day = "Sunday";break;
                case 2: day = "Monday";break;
                case 3: day = "Tuesday";break;
                case 4: day = "Wednesday";break;
                case 5: day = "Thursday";break;
                case 6: day = "Friday";break;
                default: System.exit(0);
        }
        System.out.println(day);
    }
}
