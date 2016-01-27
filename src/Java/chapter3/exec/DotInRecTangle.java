package Java.chapter3.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/12.
 */
public class DotInRecTangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dot e.g. (x,y)");
        double x = Double.valueOf(scanner.next());
        double y = Double.valueOf(scanner.next());
        if(Math.abs(x) < (double)5/2 && Math.abs(y) < (double)10/2){
            System.out.println("In");
        }else System.out.println("out");
    }
}
