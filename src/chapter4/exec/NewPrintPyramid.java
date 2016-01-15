package chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */

//TODO
public class NewPrintPyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8-i; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((int)(Math.pow(2,j)) + "  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((int)(Math.pow(2,i-j)) + "  ");
            }

            System.out.println();
        }
    }
}
