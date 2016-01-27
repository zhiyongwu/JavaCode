package Java.chapter12.exam;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2016/1/27.
 */
public class TestImageIcon extends JFrame{
    private ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Pictures\\share.jpg");
    public TestImageIcon(){
        setLayout(new GridLayout(1,1,5,5));
        add(new JLabel(icon));
    }

    public static void main(String[] args) {
        JFrame frame = new TestImageIcon();
        frame.setTitle("title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
