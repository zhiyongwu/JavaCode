package Java.chapter3.exam;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        switch (year % 12){
            case 0:
                System.out.println("Monkey");break;
            case 1:
                System.out.println("rooster");break;
            case 2:
                System.out.println("dog");break;
            case 3:
                System.out.println("pig");break;
            case 4:
                System.out.println("rat");break;
            case 5:
                System.out.println("ox");break;
            case 6:
                System.out.println("tiger");break;
            case 7:
                System.out.println("rabbit");break;
            case 8:
                System.out.println("dragon");break;
            case 9:
                System.out.println("snake");break;
            case 10:
                System.out.println("horse");break;
            case 11:
                System.out.println("sheep");
        }


    }
}
