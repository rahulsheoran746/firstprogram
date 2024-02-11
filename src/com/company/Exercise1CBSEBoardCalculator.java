package com.company;

import java.util.Scanner;

public class Exercise1CBSEBoardCalculator {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks of one subject:");
        byte b1 = sc.nextByte();
        System.out.print("Enter Subject1 Marks:");
        float f1= sc.nextFloat();
        System.out.print("Enter Subject2 Marks:");
        float f2= sc.nextFloat();
        System.out.print("Enter Subject3 Marks:");
        float f3= sc.nextFloat();
        System.out.print("Enter Subject4 Marks:");
        float f4= sc.nextFloat();
        System.out.print("Enter Subject5 Marks:");
        float f5= sc.nextFloat();
        float f6 = (f1+f2+f3+f4+f5)*100/(5*b1);
        System.out.println("Congratulations, Your total percentage is: "+f6);
    }


}
