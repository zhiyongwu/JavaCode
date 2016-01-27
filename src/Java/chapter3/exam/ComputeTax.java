package Java.chapter3.exam;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class ComputeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0--single,1--married,2--mar-sep,3--head of...");
        int status = scanner.nextInt();
        System.out.println("Input taxable income:");
        double income = scanner.nextDouble();

        double tax = 0;

        if(status == 0){
            if(income < 8350){
                tax = income * .1;
            }
            else if(income < 33950){
                tax = (income-8350) * .15 + 8350 * .1;
            }
            else if(income < 52250){
                tax = (income-39950) * .25 + (39950 - 8351) * .15 + 8350*.1;
            }
            else if (income < 171500){
                tax = (income-52250) * .28 + (52250 - 39950)*.25 + (39950 - 8351)*.15 + 8350*.1;
            }
            else if(income < 372950){
                tax = (income-171500) * .33 + (171500 - 52250)*.28 + (52250 - 39950)*.25 + (39950 - 8351)*.15 + 8350*.1;
            }
            else {
                tax = (income-372950) * .35 +(372950 - 171500)*.33 + (171500 - 52250)*.28 + (52250 - 39950)*.25 + (39950 - 8351)*.15 + 8350*.1;
            }
        }
        else if(status == 2){}
        else if(status == 3){}
        else if(status == 4){}
        else {
            System.out.println("invalid status");
            System.exit(1);
        }
        System.out.println("tax is:" + tax);
    }
}
