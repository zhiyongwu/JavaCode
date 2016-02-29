package Java.chapter12.exam;

import javax.swing.*;

/**
 * Created by Administrator on 2016/1/27.
 */
public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame");
        JButton jbtnOK = new JButton("OK");
        jbtnOK.setSize(50,20);
        frame.add(jbtnOK);
        frame.setSize(300,700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
