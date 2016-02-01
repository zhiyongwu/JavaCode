package Java.chapter8.exam;

import javax.swing.*;

/**
 * Created by Administrator on 2016/1/26.
 */
public class TestFrame {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame();
        frame1.setTitle("window1");
        frame1.setSize(400,200);
        frame1.setLocation(200,100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        JFrame frame2 = new JFrame();
        frame2.setTitle("window1");
        frame2.setSize(400,200);
        frame2.setLocation(810,100);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    }
}
