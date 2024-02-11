package com.company;

class Print1to10 extends Thread{
    int a;
    Print1to10(int a){
        this.a=a;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);

    }
}
public class MutiThreading {
    public static  void calling(int a){
        for(int i=a;i<a+10;i++){
            Print1to10 p =new Print1to10(i);
            p.start();
            try {
                p.join();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        int a=1;
        int count=1;
        for(int i=0;i<10;i++) {
            System.out.println("Batch No: "+ count++);
            calling(a);
            a+=10;

        }

    }
}
