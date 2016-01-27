package Java.chapter2.exam;

import javax.swing.*;

/**
 * Created by Administrator on 2015/12/30.
 */
public class ComputeLoanUsingInputDialog {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,"please input number","input dialog",JOptionPane.QUESTION_MESSAGE);
        double d = Double.parseDouble(s);
        System.out.println(d);
    }
}
