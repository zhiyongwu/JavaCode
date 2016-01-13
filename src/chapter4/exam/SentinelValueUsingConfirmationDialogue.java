package chapter4.exam;

import javax.swing.*;

/**
 * Created by Administrator on 2016/1/13.
 */
public class SentinelValueUsingConfirmationDialogue {
    public static void main(String[] args) {
        int sum = 0;
        int option = JOptionPane.YES_OPTION;
        while (option == JOptionPane.YES_OPTION){
            String dataString = JOptionPane.showInputDialog("Enter an int value");
            int data = Integer.parseInt(dataString);
            sum += data;
            option = JOptionPane.showConfirmDialog(null,"continue?");
        }
        JOptionPane.showMessageDialog(null,"The sum is " + sum);
    }
}
