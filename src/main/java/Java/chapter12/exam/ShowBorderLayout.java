package Java.chapter12.exam;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2016/1/27.
 */
public class ShowBorderLayout extends JFrame {
    public ShowBorderLayout(){
        setLayout(new BorderLayout(5,10));
        add(new JButton("East"),BorderLayout.EAST);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("Center"),BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new ShowBorderLayout();
        frame.setTitle("Gridlayout");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
