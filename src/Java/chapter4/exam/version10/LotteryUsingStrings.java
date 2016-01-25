package Java.chapter4.exam.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/18.
 */
public class LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery = "" + (int)(Math.random()*10) + (int)(Math.random()*10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your lottery pick(two digits) : ");
        String guess = scanner.nextLine();

        char lDigit1 = lottery.charAt(0);
        char lDigit2 = lottery.charAt(1);

        char gDigit1 = guess.charAt(0);
        char gDigit2 = guess.charAt(1);

        System.out.println("The lottery is " + lottery);

        if(guess.equals(lottery)){
            System.out.println("Exactly you win $10000");
        }else if(lDigit1 == gDigit2 && lDigit2 == gDigit1){
            System.out.println("Match all you win $3k");
        }
        else if(lDigit1 == gDigit1 ||
                lDigit2 == gDigit2 ||
                lDigit1 == gDigit2 ||
                lDigit2 == gDigit1){
            System.out.println("Match 1 and you win $1k");
        }
        else {
            System.out.println("Sorry no match");
        }
    }
}
