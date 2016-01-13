package chapter4.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/13.
 */
public class Exercise {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static void kiloToPounds(){
        System.out.print("千克   ");
        System.out.println("磅");
        for (int i = 1; i < 200; i++) {
            System.out.print(i);
            System.out.printf("   %.1f",i*2.2);
            System.out.println();
        }
    }



    public static void calculateFee(){
        int fee = 10000;
        int sum = 0;
        for (int i = 1; i < 15; i++) {
            fee *= (1+0.05);
            if(i < 11){
                System.out.println(fee);
            }
            if(i >= 11){
                sum += fee;
            }
        }
        System.out.println(sum);
    }


    public static void showHighest(){
        System.out.println("Enter nunbers of students");
        int student_count = SCANNER.nextInt();
        int count = 0;

        System.out.println("score and name:");
        double score1 = Double.valueOf(SCANNER.next());
        String name1 = SCANNER.next();
        double score = 0;
        String name = "";
        do {
            System.out.println("score and name:");
            score = Double.valueOf(SCANNER.next());
            name = SCANNER.next();
            if(score1 < score){
                name1 = name;
                score1 = score;
            }
            count++;
        }while (count < student_count-1);

        System.out.println(name1 + score1);
    }

    public static void main(String[] args) {
//        kiloToPounds();
//        calculateFee();
        showHighest();
    }
}
