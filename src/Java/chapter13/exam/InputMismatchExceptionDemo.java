package Java.chapter13.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/27.
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        do {
            try {
                int n = scanner.nextInt();
                cont = false;
            }catch (InputMismatchException ex){
                System.out.println("Try again");
                scanner.nextLine();

            }
        }while (cont);
    }
}
