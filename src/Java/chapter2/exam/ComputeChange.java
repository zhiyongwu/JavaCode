package Java.chapter2.exam;

import javax.swing.*;

/**
 * Created by Administrator on 2015/12/30.
 */
public class ComputeChange {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a number of Amount like 11.56");
//        double amount = s.nextDouble();
//        int remaningAmonut = (int)amount * 100;
//        int remaningDoallors = remaningAmonut/100;
//        remaningAmonut = remaningAmonut%100;
//        int numberOfQuartors = remaningAmonut/25;
//        remaningAmonut = remaningAmonut%25;
//        System.out.println();


        String input = JOptionPane.showInputDialog("Enter your input");
        System.out.println(input);
        String input1 = JOptionPane.showInputDialog(null,"enter content","input demo",JOptionPane.QUESTION_MESSAGE);
    }
}
