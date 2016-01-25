package Java.chapter4.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/15.
 */
public class CommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.valueOf(scanner.next());
        int n2 = Integer.valueOf(scanner.next());

        if(n1 > n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        for (int i = n1; i <= n1; i--) {
            if(n1 % i == 0 && n2 % i == 0){
                System.out.println(i);
                break;
            }
        }


    }
}
