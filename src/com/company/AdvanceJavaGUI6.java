package com.company;
import java.awt.*;
import javax.swing.*;

public class AdvanceJavaGUI6 {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Menu");
        f.setSize(700, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        JMenuBar jmb = new JMenuBar();

        JMenu m1 = new JMenu("File");
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
//      JMenuItem i4 = new JMenuItem("Save As");
        //for pop up window we use JOptionPane.fxn()
 //       i1.addActionListener(e->JOptionPane.showMessageDialog(f,"New File opened.."));
 //       i1.addActionListener(e->JOptionPane.showInputDialog(f,"Enter File name"));
        i1.addActionListener(e->JOptionPane.showConfirmDialog(f,"Do You Know"));

       //this is for nesting menuitem
        JMenu m11 = new JMenu("Save As");
        m11.add(new JMenuItem("pdf"));
        m11.add(new JMenuItem("doc"));
        m11.add(new JMenuItem("txt"));

        m1.add(i1);
        m1.add(i2);
        m1.insertSeparator(2);
        m1.add(i3);
//      m1.add(i4);
        m1.add(m11);
        jmb.add(m1);

        JMenu m2 = new JMenu("Edit");
        JMenuItem i11=new JMenuItem("cut");
        JMenuItem i12=new JMenuItem("copy");
        JMenuItem i13=new JMenuItem("paste");
        JMenuItem i14=new JMenuItem("delete");
        m2.add(i11);
        m2.add(i12);
        m2.insertSeparator(3);
        m2.add(i13);
        m2.add(i14);
        jmb.add(m2);
        JMenu m3 = new JMenu("View");
        JMenuItem i21=new JMenuItem("Recent Files");
        JCheckBoxMenuItem cm = new JCheckBoxMenuItem("Status Bar", true);
        m3.add(cm);
        m3.add(i21);
        jmb.add(m3);

        f.setJMenuBar(jmb);

        f.setVisible(true);
    }
}
