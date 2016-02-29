package Java.chapter8.exam;

import javax.swing.*;

/**
 * Created by Administrator on 2016/1/26.
 */
public class GUIComponents {
    public static void main(String[] args) {
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");
        JLabel jlblName = new JLabel("Enter your name: ");
        JTextField jtfName = new JTextField("Type name here");
        JCheckBox jchkBold = new JCheckBox("Bold");
        JCheckBox jchkItalic = new JCheckBox("Italic");
        JRadioButton jrbRed = new JRadioButton("Red");
        JRadioButton jrbYellow = new JRadioButton("Yellow");
        JComboBox jcboColor = new JComboBox(new String[]{"Freshman","Sophomore","Junior","Senior"});
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);
        panel.add(jlblName);
        panel.add(jtfName);
        panel.add(jchkBold);
        panel.add(jchkItalic);
        panel.add(jrbRed);
        panel.add(jrbYellow);
        panel.add(jcboColor);

        JFrame jFrame = new JFrame();
        jFrame.add(panel);
        jFrame.setTitle("show gui components");
        jFrame.setSize(450,200);
        jFrame.setLocation(200,100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
