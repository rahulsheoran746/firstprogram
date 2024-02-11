package com.company;

import java.util.Random;
import java.util.Scanner;


public class Exercise2_StonePaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,a1 = 0,a2=0,a3=0;
        for(int j =1;j<=5;j++){
        System.out.print("Press 0 for Rock, 1 for Paper, 2 for Scissor : ");
        r = sc.nextInt();
        if (r == 0 || r == 1 || r == 2) {
//        if(r==0){
//            System.out.println("You choose Rock");
//        }
//        else if(r==1){
//            System.out.println("Your choose Paper");
//        }
//        else if(r==2){
//            System.out.println("you choose Scissor");
//        }
//        else {
//            System.out.println("You Enter number other than 0,1,2.");
//        }
            switch (r) {
                case 0 -> System.out.println("You choose Rock");
                case 1 -> System.out.println("You choose Paper");
                case 2 -> System.out.println("You choose Scissor");
            }
            Random random = new Random();
            int i = random.nextInt(3);
            if (i == 0)
                System.out.println("Your opponent choose Rock");
            else if (i == 1)
                System.out.println("Your opponent choose Paper");
            else if (i == 2)
                System.out.println("you opponent choose Scissor");
            if ((i == 0 && r == 1) || (i == 1 && r == 2) || (i == 2 && r == 0)) {
                System.out.println("You win");
                a1++;
            } else if ((i == 0 && r == 2) || (i == 1 && r == 0) || (i == 2 && r == 1)) {
                System.out.println("Your opponent win.");
                a2++;
            } else if (i == r) {
                System.out.println("Match Draw.");
                a3++;
            }
        }
        else {
            System.out.println("Please enter  0,1 or 2.");
        }
        }
//        System.out.println(a1);
//        System.out.println(a2);
        if(a1>a2){
            System.out.println("you win overall series of 5 matches by "+a1+"-"+a2+" and there is "+a3+" matches draw.");
        }
        else if(a2>a1){
            System.out.println("you lost overall series of 5 matches by "+a1+"-"+a2+" and there is "+a3+" matches draw.");
        }
        else{
            System.out.println("Series Draw by "+a1+"-"+a2+" and there is "+a3+" matches draw.");
        }
    }
}
