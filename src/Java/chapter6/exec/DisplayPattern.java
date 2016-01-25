package Java.chapter6.exec;

/**
 * Created by Administrator on 2016/1/20.
 */
public class DisplayPattern {
    public static void displayPattern(int n){
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("    ");
            }
            for (int j = i; j > 0; j--) {
                System.out.printf("%4d",j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        displayPattern(10);
    }
}
