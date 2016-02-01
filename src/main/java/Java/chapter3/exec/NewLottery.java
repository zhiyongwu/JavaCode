package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class NewLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottery  = (int)(Math.random()*1000);
        System.out.println(lottery);
        System.out.println("Enter a number: ");

        int l1 = lottery / 100;
        int l2 = lottery % 100 / 10;
        int l3 = lottery % 100 % 10;

        int guess = scanner.nextInt();
        int g1 = guess / 100;
        int g2 = guess % 100 / 10;
        int g3 = guess % 100 % 10;

        int[] la = new int[]{l1,l2,l3};
        int[] ga = new int[]{g1,g2,g3};

        if(guess == lottery){
            System.out.println("You win 10000");
        }else if(sort(l1,l2,l3) == sort(g1,g2,g3)) {
            System.out.println("You win 3000");
        }else if(oneMatch(la,ga)){
            System.out.println("Only one match");
        }else {
            System.out.printf("sorry");
        }



    }


    public static int sort(int a,int b,int c){
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(a < c){
            int temp = a;
            a = c;
            c =temp;
        }
        if(b < c){
            int temp = b;
            b = c;
            c = temp;
        }

        return a*100+b*10+c;
    }

    public static boolean oneMatch(int[] a,int[] b){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    count++;
                }
            }
        }
        if(count != 1){
            return false;
        }
        else return true;
    }
}
