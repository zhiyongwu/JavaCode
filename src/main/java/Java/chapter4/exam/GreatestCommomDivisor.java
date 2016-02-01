package Java.chapter4.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/13.
 */
public class GreatestCommomDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two nums:");
        int n1 = Integer.valueOf(scanner.next());
        int n2 = Integer.valueOf(scanner.next());
        int gcd = 1;
        int k = 2;
        while (k < n1 && k < n2){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            k++;
        }

        System.out.println(gcd);


    }




}
