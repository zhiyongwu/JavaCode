package Java.chapter4.exec;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/13.
 */
public class CountNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int input;
        int posSum = 0;
        int negSum = 0;
        int negCount = 0;
        int posCount = 0;
        do {
            input = Integer.valueOf(scanner.next());
            if(input > 0){
                posCount++;
                posSum += input;
            }
            else if(input < 0){
                negCount++;
                negSum += input;
            }
        }while (input != 0);

        System.out.println("The number of positives is " + posCount);
        System.out.println("The number of negatives is " + negCount);
        System.out.println("The total is " + (posSum + negSum));
        System.out.println("The average is " + (double)(posSum + negSum)/(posCount + negCount));
    }
}
