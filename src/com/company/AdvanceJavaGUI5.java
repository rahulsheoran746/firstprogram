package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Pair{
    public int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class AdvanceJavaGUI5 extends Canvas {
    static JLabel l;
    static int startX,startY,endX,endY;
    static ArrayList<Pair>startPoints =new ArrayList<>();
    static ArrayList<Pair>endPoints =new ArrayList<>();
    static AdvanceJavaGUI5 mg =new AdvanceJavaGUI5();
    public void paint(Graphics g) {
        Font f = new Font("SERIF", Font.ITALIC, 30);
        g.setColor(Color.BLUE);
        g.setFont(f);
        g.drawString("Ravi Kant Sahu", 200, 50);
        g.setColor(Color.red);
        g.drawRect(184, 13, 230, 50);
        //bangladesh flag
//        g.setColor(Color.GREEN);
//        g.fillRect(150, 150, 400, 250);
//
//        g.setColor(Color.red);
//        g.fillOval(300, 225, 100, 100);
//Line with some slope
//        g.setColor(Color.BLUE);
//        g.drawLine(100, 200, 300, 150);

//Pizza
//        g.setColor(Color.yellow);
//        g.fillArc(100, 100, 200, 200, 30, 300);
//
////Slice
//
//        g.setColor(Color.ORANGE);
//        g.fillArc(110, 100, 200, 200, 330, 60);
//
//        g.setColor(Color.cyan);
//        int[] x = {200, 100, 300, 380};
//        int[] y = {50, 150, 250, 100};
//        g.fillPolygon(x, y, 4);
        //for drawing line like paint
       // System.out.println(startPoints.size()+" "+endPoints.size());
       // System.out.println(startX+" "+startY+" "+endX+" "+endY);
        g.setColor(Color.red);
        g.setFont(new Font("serif",2,70));
        g.drawLine(startX,startY,endX,endY);


    }

    public static void main(String[] args) {
       // AdvanceJavaGUI5 mg = new AdvanceJavaGUI5();
        JFrame f = new JFrame();
        f.setSize(700, 500);
        f.setLocationRelativeTo(null);
        f.add(mg);
        f.setTitle("abcd");
        l=new JLabel();
        l.setText("Label");
        f.add(l, BorderLayout.SOUTH);
        mg.addMouseMotionListener(new MyML());//register
        mg.addMouseListener(new MyML());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 class MyML extends MouseAdapter {
     public void mouseMoved(MouseEvent e){
       AdvanceJavaGUI5.l.setText(e.getX()+","+e.getY());
    }
     public void mousePressed(MouseEvent e) {
       AdvanceJavaGUI5.startX=e.getX();
       AdvanceJavaGUI5.startY=e.getY();
       AdvanceJavaGUI5.startPoints.add(new Pair(AdvanceJavaGUI5.startX,AdvanceJavaGUI5.startY));
     }
     public void mouseDragged(MouseEvent e){
         AdvanceJavaGUI5.endX=e.getX();
         AdvanceJavaGUI5.endY=e.getY();
        // System.out.println(AdvanceJavaGUI5.endX+" "+AdvanceJavaGUI5.endY);
         AdvanceJavaGUI5.mg.repaint();

     }
     public void mouseReleased(MouseEvent e) {
        AdvanceJavaGUI5.endPoints.add(new Pair(AdvanceJavaGUI5.endX,AdvanceJavaGUI5.endY));
     }

}


