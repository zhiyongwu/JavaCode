package chapter4.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/15.
 */
public class ToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        int num = scanner.nextInt();
        for (;;) {
            int n = num%2;
            num = num /2;
            s += n;
            if(num == 0){
                break;
            }

        }

        for (int i = s.toCharArray().length;i > 0;i--) {
            System.out.print(s.toCharArray()[i-1]);
        }
    }
}
