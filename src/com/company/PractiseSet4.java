package com.company;

import java.util.Scanner;

public class PractiseSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Q2
        System.out.print("Enter total marks of one subject:");
        float f = sc.nextFloat();
        System.out.print("Enter Subject1 marks:");
        float f1 = sc.nextFloat();
        System.out.print("Enter Subject2 marks:");
        float f2 = sc.nextFloat();
        System.out.print("Enter Subject3 marks:");
        float f3 = sc.nextFloat();
        float per = (f1+f2+f3)*100.f/(3*f);
        if(f1>(.33*f)&&f2>(.33*f)&&f3>(.33*f)&&per>40){
            System.out.println("Congratulation you are passed.");
        }
        else{
            System.out.println("Better luck, Try next time.");
        }
         */
        /*Q3
        System.out.print("Enter your Income(in Lakhs):");
        float income = sc.nextFloat();
      float tax=0;
        if(income<2.5f){
            System.out.println("Congratulation,No Tax ");
        }
        else if(income>2.5f&&income<=5.0f){
            tax = (.05f*(income-2.5f));
            System.out.print("Your Tax is :"+tax*100000+"rupees");
        }
        else if(income>5.0f&&income<=10.0f){
           tax = (.05f*2.5f)+ (income-5.0f)*.2f;
            System.out.println("Your tax is :"+tax*100000+"rupees");
        }
        else{
            tax = (.05f*2.5f) +(.2f*5) +(income-10.0f)*.3f;
            System.out.println("Your tax is:"+tax*100000+"rupees");
        }

         */
        /*Q4
        System.out.print("Enter any number between 1 to 7:");
        int i =sc.nextInt();
        switch(i){
            case(1)-> System.out.println("Monday");
            case(2)-> System.out.println("Tuesday");
            case(3)-> System.out.println("Wednesday");
            case(4)-> System.out.println("Thursday");
            case(5)-> System.out.println("Friday");
            case(6)-> System.out.println("Saturday");
            case(7)-> System.out.println("Sunday");
            default-> System.out.println("Please enter number between 1 and 7");
        }
         */
        /*Q5
        System.out.print("Enter year :");
        int year = sc.nextInt();
        if((year%400==0)||(year%4==0&&year%100!=0)){
            System.out.print(year+" is leap year");
        }
//        else if(year%4==0&&year%100!=0){
//            System.out.print(year+ " is leap year");
//        }
        else{
            System.out.println("This is not a leap year");
        }
         */
        /*Q6
        System.out.print("Enter your website:");
        String web = sc.nextLine();
        if(web.contains(".com")){
            System.out.println("Commercial website.");
        }
        else if(web.endsWith(".org")){
            System.out.println("Organisation website.");
        }
        else if(web.contains(".in")){
            System.out.println("Indian Website.");
        }
        else{
            System.out.println("Any other website.");
        }
         */







    }
}
