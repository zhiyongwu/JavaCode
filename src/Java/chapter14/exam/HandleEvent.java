package Java.chapter14.exam;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2016/1/27.
 */
public class HandleEvent extends JFrame {
    public HandleEvent(){
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);
        add(panel);
        OKListenerClass listener1 = new OKListenerClass();
        CancelListerClass listenr2 = new CancelListerClass();
        jbtOK.addActionListener(listener1);
        jbtCancel.addActionListener(listenr2);

    }

    public static void main(String[] args) {
        JFrame frame = new HandleEvent();
        frame.setTitle("Event Listener");
        frame.setSize(150,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


class OKListenerClass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK button clicked");
    }
}

class CancelListerClass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel button clicked");
    }
}