package Java.chapter12.exam;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2016/1/27.
 */
public class TestPanels extends JFrame{
    public TestPanels(){
        JPanel pl = new JPanel();
        pl.setLayout(new GridLayout(4,3));

        for (int i = 1; i < 10; i++) {
            pl.add(new JButton("" + i));
        }
        pl.add(new JButton("0"));
        pl.add(new JButton("start"));
        pl.add(new JButton("stop"));

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JTextField("time to be displayed here"),BorderLayout.NORTH);
        p2.add(pl,BorderLayout.CENTER);
        add(p2,BorderLayout.EAST);
        add(new JButton("Food to be placed here"),BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new TestPanels();
        frame.setSize(400,250);
        frame.setTitle("TestPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
