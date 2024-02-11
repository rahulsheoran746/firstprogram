package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AdvanceJavaGUI2 {
    public static void main(String[] args) {
        //Default layout is BorderLayout for frame
//        //Flow Layout
//        JFrame jf = new JFrame();
//        jf.setSize(200, 350);
//        jf.getContentPane().setBackground(Color.cyan);
//        jf.setLocationRelativeTo(null);
//
//        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT,20,10 );
//        jf.setLayout(fl);
//        //jf.setResizable(false);
//        for(int i = 0; i < 10; i++)
//            jf.add(new JButton(""+i));
//        jf.setVisible(true);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Grid Layout
        JFrame jf = new JFrame();
        jf.setSize(600, 350);
        jf.getContentPane().setBackground(Color.cyan);

        GridLayout gl = new GridLayout(2, -2, 20, 30);
        jf.setLayout(gl);

        for(int i = 0; i < 6; i++)
            jf.add(new JButton(""+i));

        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
