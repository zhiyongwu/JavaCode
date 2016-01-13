package chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class SortNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 Integer");
        int n1 = Integer.valueOf(scanner.next());
        int n2 = Integer.valueOf(scanner.next());
        int n3 = Integer.valueOf(scanner.next());

        if(n1 > n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if(n1 > n3){
            int temp = n1;
            n1 = n3;
            n3 = temp;
        }
        if(n2 > n3){
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }
        System.out.printf("%d%d%d",n1,n2,n3);

    }
}
