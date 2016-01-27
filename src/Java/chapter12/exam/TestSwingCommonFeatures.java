package Java.chapter12.exam;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by Administrator on 2016/1/27.
 */
public class TestSwingCommonFeatures extends JFrame {
    public TestSwingCommonFeatures(){
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
        JButton jbtLeft = new JButton("Left");
        JButton jbtRight = new JButton("Right");
        JButton jbtCenter = new JButton("Center");
        jbtLeft.setBackground(Color.WHITE);
        jbtCenter.setForeground(Color.GREEN);
        jbtRight.setToolTipText("This is the right button");
        p1.add(jbtLeft);
        p1.add(jbtRight);
        p1.add(jbtCenter);
        p1.setBorder(new TitledBorder("Three Buttons"));

        Font largeFont = new Font("TimesRoman",Font.BOLD,20);
        Border lineBorder = new LineBorder(Color.black,2);

        JPanel p2 = new JPanel(new GridLayout(1,2,5,5));
        JLabel jlbRed = new JLabel("Red");
        JLabel jlbOrange = new JLabel("Orange");
        jlbRed.setForeground(Color.red);
        jlbOrange.setForeground(Color.ORANGE);
        jlbOrange.setFont(largeFont);
        jlbRed.setFont(largeFont);
        jlbRed.setBorder(lineBorder);
        jlbOrange.setBorder(lineBorder);
        p2.add(jlbOrange);
        p2.add(jlbRed);
        p2.setBorder(new TitledBorder("Two Buttons"));
        setLayout(new GridLayout(2,1,5,5));
        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        JFrame frame = new TestSwingCommonFeatures();
        frame.setSize(300,150);
        frame.setTitle("Test Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
