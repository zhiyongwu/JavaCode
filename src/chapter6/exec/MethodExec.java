package chapter6.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/21.
 */
public class MethodExec {
    public static double displayPI(int n){
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(-1,i+1)/(2*i - 1);
        }
        return sum * 4;
    }

    public static int daysOfYear(int year){
        return year%4 == 0 && year % 100 != 0 || year % 400 == 0 ? 366 : 365;
    }


    public static void printMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( (int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }

    public static void checkPassword(String password){
        int count = 0;
        if(password.length() < 8){
            System.out.println("Invalid");
        }else {
            for (int i = 0; i < password.length(); i++) {
                if(!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))){
                    System.out.println("Invalid");
                    return;
                }
                else {
                    if(Character.isDigit(password.charAt(i))){
                        count ++ ;
                    }
                }
            }
            if(count < 2){
                System.out.println("Invalid");
            }
            else System.out.println("valid");
        }
    }

    public static int countLetters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        return count;
    }


    public static double sqrt(long n){
        double lastGuess = 1;
        double nextGuess = 0;
        while (true){
            nextGuess = (lastGuess + n/lastGuess)/2;
            if(Math.abs(lastGuess - nextGuess) < 0.0001 ){
                break;
            }
            else lastGuess = nextGuess;
        }
        return nextGuess;
    }

    public static int count(String s,char ch){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(ch == s.charAt(i)){
                count++;
            }
        }
        return count;
    }


    public static String convertMills(long mills){
        double ss =mills / 1000;
        double s = ss%60;
        double m = ss / 60 % 60;
        double h = ss / 60 / 60;
        return (int)h+":"+(int)m+":"+(int)s;
    }



    public static void main(String[] args) {
//        System.out.println("i                  mi\n------------------------");
//        for (int i = 1; i <=901 ; i+=100) {
//            System.out.printf("%-3d              ",i);
//            System.out.printf("%6.4f\n",displayPI(i));
//        }


//        for (int i = 2000; i <=2020 ; i++) {
//            System.out.println(daysOfYear(i) + " ");
//        }


//        printMatrix(5);

//        checkPassword("abcdefg1");
//        System.out.println(countLetters());
//        System.out.println(sqrt(100));
//        System.out.println(count("Welcome",'e'));
        System.out.println(convertMills(555550000));


    }
}
