package Java.chapter12.exam;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2016/1/27.
 */
public class ShowFlowLayout extends JFrame {
    public ShowFlowLayout(){
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        add(new JLabel("First name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last name"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
