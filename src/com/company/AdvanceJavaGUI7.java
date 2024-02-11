package com.company;
import java.awt.*;
import javax.swing.*;


public class AdvanceJavaGUI7 {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Menu");
        f.setSize(700, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        JTabbedPane jtp = new JTabbedPane();
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        JLabel l1 = new JLabel("Username");
        l1.setBounds(100,50,100,40);
        JLabel l2 =new JLabel("Password");
        l2.setBounds(100,150,100,40);
        JTextField tf1 =new JTextField();
        tf1.setBounds(200,50,100,40);
        JPasswordField tf2 =new JPasswordField();
        tf2.setBounds(200,150,100,40);
        p1.add(tf1);
        p1.add(tf2);
        p1.add(l1);
        p1.add(l2);
        jtp.addTab("Personal", p1);

        JPanel p2 = new JPanel();
        JLabel l11 = new JLabel("My Label");
        p2.add(l11);
        jtp.addTab("Academic", p2);
        f.add(jtp);

        p1.setBackground(Color.orange);
        p2.setBackground(Color.CYAN);

        f.setVisible(true);
    }
}
