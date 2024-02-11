package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AdvanceJavaGUI9 {
    static JButton prev, next;
    static CardLayout cl;
    static JPanel p;
    static JComboBox<String>jcb;
    public static void main(String[] args) {
        JFrame f = new JFrame("My Cards");
        f.setSize(800, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        p = new JPanel();
        cl = new CardLayout();
        p.setLayout(cl);
        f.add(p);
        JPanel p1 = new JPanel(); p1.setBackground(Color.RED);
        p.add(p1, "Red");
        JPanel p2 = new JPanel(); p2.setBackground(Color.GREEN);
        p.add(p2, "Green");
        JPanel p3 = new JPanel(); p3.setBackground(Color.cyan);
        p.add(p3, "Cyan");
        JPanel p4 = new JPanel(); p4.setBackground(Color.YELLOW);
        p.add(p4, "Yellow");
        JPanel p5 = new JPanel(); p5.setBackground(Color.MAGENTA);
        p.add(p5, "Magenta");

        JPanel buttons = new JPanel();
        prev = new JButton("Previous");
        next = new JButton("Next");
        buttons.add(prev); buttons.add(next);
        f.add(buttons, BorderLayout.SOUTH);

        String [] str = {"Yellow", "Green", "Red", "Magenta", "Cyan"};
        jcb = new JComboBox<String>(str);
        buttons.add(jcb);

//        MyListener ml = new MyListener();
//        prev.addActionListener(ml);
//        next.addActionListener(ml);
//        jcb.addActionListener(ml);


        ActionListener al =e -> {
            if (e.getSource()==prev){
            cl.previous(p);
            }
            else if(e.getSource()==next){
                cl.next(p);
            }
            else if(e.getSource()==jcb){
                String selected = (String) jcb.getSelectedItem();
                cl.show(p,selected);
            }
        };
        prev.addActionListener(al);
        next.addActionListener(al);
        jcb.addActionListener(al);

        f.setVisible(true);
    }
}
class MyListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == AdvanceJavaGUI9.prev)
        {
            AdvanceJavaGUI9.cl.previous(AdvanceJavaGUI9.p);
        }
        else if(e.getSource() == AdvanceJavaGUI9.next)
        {
                AdvanceJavaGUI9.cl.next(AdvanceJavaGUI9.p);
        }
        else if(e.getSource() == AdvanceJavaGUI9.jcb)
        {
            String selected = (String)AdvanceJavaGUI9.jcb.getSelectedItem();
           AdvanceJavaGUI9.cl.show(AdvanceJavaGUI9.p, selected);
        }
    }
}
