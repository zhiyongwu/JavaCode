package Java.chapter4.exam;

/**
 * Created by Administrator on 2016/1/13.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("         MultiplicationTable");
        System.out.print("  ");
        for (int i = 0; i <= 9; i++) {
            System.out.print("   " + i);
        }
        System.out.println("\n---------------------");

        for (int i = 0; i <= 9; i++) {
            System.out.print(i + "|");
            for (int j = 0; j <= 9; j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}
