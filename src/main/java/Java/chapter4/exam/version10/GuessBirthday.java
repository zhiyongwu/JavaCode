package Java.chapter4.exam.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/18.
 */
public class GuessBirthday {
    public static void main(String[] args) {
        String set1 = "1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31";
        String set2 = "2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31";
        String set3 = "4 5 6 7 12 13 14 15 24 25 26 27 28 29 30 31";
        String set4 = "8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31";
        String set5 = "16 17 18 19 20 221 22 23 24 25 26 27 28 29 30 31";
        int day = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Is your birthday in Set1?");
        System.out.println(set1);
        System.out.println("Enter N for NO and Y for Yes");
        String answer = input.nextLine();

        if(answer.equals("Y")){
            day += 1;
        }
        System.out.println("Is your birthday in Set2?");
        System.out.println(set2);
        System.out.println("Enter N for NO and Y for Yes");
        answer = input.nextLine();
        if(answer.equals("Y") ){
            day +=2;
        }

        System.out.println("Is your birthday in Set3?");
        System.out.println(set3);
        System.out.println("Enter N for NO and Y for Yes");
        answer = input.nextLine();

        if(answer.equals("Y")){
            day += 4;
        }

        System.out.println("Is your birthday in Set4?");
        System.out.println(set4);
        System.out.println("Enter N for NO and Y for Yes");
        answer = input.nextLine();

        if(answer.equals("Y")){
            day += 8;
        }

        System.out.println("Is your birthday in Set5?");
        System.out.println(set5);
        System.out.println("Enter N for NO and Y for Yes");
        answer = input.nextLine();
        if(answer.equals("Y")){
            day += 16;
        }

        System.out.println("It is " + day);
    }
}
