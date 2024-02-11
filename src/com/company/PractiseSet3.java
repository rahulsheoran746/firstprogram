package com.company;

import java.util.Scanner;

public class PractiseSet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any name:");
        String s = sc.nextLine();
       //Q1 System.out.println(s.toLowerCase());
       //Q2 System.out.println(s.replace(' ','_'));
        /*Q3
        String letter ="Dear name, Thanks a lot ";
        System.out.println(letter.replace("name",s));
         */
        //Q4 System.out.println(s.contains("  "));
        System.out.println("Dear Rahul,\n\t This java course is nice.\n\t Thanks");

    }
}
