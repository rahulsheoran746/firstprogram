package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdvanceJavaGUI10 extends Canvas {
    static  boolean down=false,left=false,right=true,up=false;
    static int x, y =1,i=0;
    public void paint(Graphics g)
    {
        //Color[] c={Color.CYAN,Color.GREEN,Color.red,Color.black,Color.magenta};
        // g.setColor(c[i]);
        g.setColor(Color.CYAN);
        g.fillOval(x, y, 50, 50);
//        if(x<750 &&y==1) x++;
//        else if(y < 625 && x==750) y++;
//        else if(y == 625 && x>0) x--;
//        else  y--;
        if(down) y++;
        else if(up) y--;
        else if(left) x--;
        else if(right) x++;
        try{
            Thread.sleep(2);
        }
        catch(Exception e) { System.out.println(e); }
        repaint();
//        if(x==0&&y==1) i++;//for changing the color of ball
//        if(i==5) i=0;
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
       AdvanceJavaGUI10 b = new AdvanceJavaGUI10();
       f.add(b);
       b.addKeyListener(new MyListener1());
       //by using anonymous class
//       b.addKeyListener(new KeyAdapter() {
//           public void keyPressed(KeyEvent k){
//               if(k.getKeyCode()==KeyEvent.VK_DOWN){
//                   down =true;left =false;right =false;up=false;
//               }
//               else if(k.getKeyCode()==KeyEvent.VK_UP){
//                   down =false;left =false;right =false;up=true;
//               }
//               else if(k.getKeyCode()==KeyEvent.VK_RIGHT){
//                   down =false;left =false;right =true;up=false;
//               }
//               else if(k.getKeyCode()==KeyEvent.VK_LEFT){
//                   down =false;left =true;right =false;up=false;
//               }
//           }
//       });
        f.setSize(800, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}
  class MyListener1 extends KeyAdapter {
      AdvanceJavaGUI10 b1 =new AdvanceJavaGUI10();
      @Override
      public void keyPressed(KeyEvent e) {
        //  super.keyPressed(e);
          if(e.getKeyCode()==KeyEvent.VK_DOWN){
             b1.down =true; b1.right=false;b1.left=false;b1.up=false;
          }
         else if(e.getKeyCode()==KeyEvent.VK_UP){
              b1.down =false; b1.right=false;b1.left=false;b1.up=true;
          }
          else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
              b1.down =false; b1.right=true;b1.left=false;b1.up=false;
          }
          else if(e.getKeyCode()==KeyEvent.VK_LEFT){
              b1.down =false; b1.right=false;b1.left=true;b1.up=false;
          }
      }
  }

