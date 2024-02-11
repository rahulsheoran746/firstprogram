package com.company;

import javax.swing.*;
import java.awt.*;

public class AdvanceJavaGUI8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Table && List");
        f.setSize(700, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        String [] columns = {"Item", "Price"};
        Object [][] data = {
                {"Coffee", 40},
                {"Noodles", 80},
                {"Burger", 60},
                {"Coffee", 40},
                {"Noodles", 80},
                {"Burger", 60},
                {"Coffee", 40},
                {"Noodles", 80},
                {"Burger", 60}
        };
        JTable jt = new JTable(data, columns);
        JPanel p = new JPanel();
        JScrollPane jsp = new JScrollPane(jt,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS );
        p.add(jsp);
        f.add(p);
//        Font f1 =new Font("Serif", Font.ITALIC,30);
//        String[] ab ={"ab","cd","ef","ab","cd","ef","ab","cd","ef","ab","cd","ef",
//                "ab","cd","ef","ab","cd","ef","ab","cd","ef","ab","cd","ef"};
//        JList<String> jl =new JList<>(ab);
//        JScrollPane jsp =new JScrollPane(jl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        jl.setFont(f1);
//        JPanel jp =new JPanel();
//        jp.add(jl);
//        jp.add(jsp);
//        f.add(jp);

        

        f.setVisible(true);
    }
}
