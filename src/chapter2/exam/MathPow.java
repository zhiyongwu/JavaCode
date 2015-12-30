package chapter2.exam;

import javax.swing.*;

/**
 * Created by Administrator on 2015/12/30.
 */
public class MathPow {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,3));
        System.out.println("\u6B22\u8FCE");
        JOptionPane.showMessageDialog(null,"\u6B22\u8FCE","test",JOptionPane.INFORMATION_MESSAGE);
        char letter = '\u8FCE';
        System.out.println((byte)letter);

    }
}
