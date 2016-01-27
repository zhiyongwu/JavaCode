package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class VerifyTriangle {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three edges: ");
        double e1 = Double.valueOf(scanner.next());
        double e2 = Double.valueOf(scanner.next());
        Double e3 = Double.valueOf(scanner.next());

        if(e1 + e2 > e3 && e1 + e3 > e2 && e2 + e3 > e1){
            System.out.println("OK");
        }
        else System.out.println("not OK");
    }
}
