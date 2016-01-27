package Java.chapter12.exam;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2016/1/27.
 */
public class ShowGridLayout extends JFrame{
    public ShowGridLayout(){
        setLayout(new GridLayout(3,2,5,5));
        add(new JLabel("First name"));
        add(new JTextField(8));
        add(new JLabel("Mi"));
        add(new JTextField(1));
        add(new JLabel("Last name"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        JFrame frame = new ShowGridLayout();
        frame.setTitle("showGridlayout");
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
