package Java.chapter4.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/15.
 */
public class FirstnSecondHigh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter number of students: ");
        int number = scanner.nextInt();
        System.out.println("Enter name and score of student:");
        String finame = scanner.next();
        int first = Integer.valueOf(scanner.next());
        String secname = "";
        int sec = 0;
        int score = 0;
        String name = "";
        while (count < number-1){
            count++;
            System.out.println("Enter name and score of student:");
            name = scanner.next();
            score = Integer.valueOf(scanner.next());
            if(score > first){
                first = score;
                finame = name;
            }
            if(sec < score){
                sec = score;
                secname = name;
                if(sec >= first){
                    sec = 0;
                    secname = "";
                }
            }
        }
        System.out.println(first + "   " + finame);
        System.out.println(sec + "   " + secname);
    }
}
