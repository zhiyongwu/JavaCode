package chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class PrintNumbers {
    public static void print1(){
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print2(){
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= 7-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void print3(){
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 6-i; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print4(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print1();
        print2();
        print3();
        print4();
    }
}
