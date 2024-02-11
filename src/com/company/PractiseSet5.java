package com.company;

import java.util.Scanner;

public class PractiseSet5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Q1
        int i=5;
        for(i=1;i<5;i++){
            for(int j = 5;j>i;j--){
                System.out.print(" * ");
        }
            System.out.println();
    }
         */
        /*Q2
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        System.out.println("The sum of first "+n+" even number are:");
        int i =0,sum=0;
        while(i<n){
            System.out.print(2*i);
            if(i<n-1)
                System.out.print("+");
            sum =sum+2*i;
            i++;
        }
        System.out.println("= "+sum);
         */
        /*Q3
        System.out.print("Enter a number for its table:");
        int t = sc.nextInt();
        if(t>0){
        System.out.println("The table of "+t+" is:");
        int i=1;
        while(i<=10){
            System.out.println(t+"*"+i+"="+t*i);
            i++;
        }}
        else{
            System.out.println("number should be greater than 0.");
        }
         */
        /*Q4
        System.out.print("Enter a number for its table in reverse order:");
        int t = sc.nextInt();
        System.out.println("The table of "+t+" is:");
        int i=10;
        while(i>0){
            System.out.println(t+"*"+i+"="+t*i);
            i--;
        }
         */
        /*Q5
        System.out.print("Enter a number for its factorial:");
        int f =sc.nextInt();
        int j=1;
        for(int i=1;i<=f;i++){
            j=j*i;
            System.out.print(i);
            if(i<=f-1){
                System.out.print("*");
            }
        }
        System.out.println("="+j+"\nThe factorial of "+f+" is: "+j);
         */

        /*Q6
        System.out.print("Enter a number for its factorial:");
        int f =sc.nextInt();
        int i=f,j=1;
        while(i>0){
            j=j*i;
            i--;
        }
        System.out.println("The factorial of "+f+" is: "+j);
         */
        /*Q7
        int n=5;
        int i=1,j=1;
        while(i<n){
            while(j<n) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            j=i+1;
            i++;
        }
         */
        /*Q9
        int sum =0;
        System.out.print("Enter number:");
        int t = sc.nextInt();
        for(int i=1;i<=10;i++) {
            sum = sum + t * i;
            System.out.print(t * i);
            if(i<10){
                System.out.print("+");
            }
        }
        System.out.println("="+sum);
         */
        /*Q11
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int sum=0;
        for (int i =0;i<n;i++){
            sum=sum+2*i;
            System.out.print(2*i);
            if(i<n-1){
                System.out.print("+");
            }
        }
        System.out.println("="+sum);
        System.out.println("The sum of first "+n+" even no is:"+ sum);
         */
        /*
        //Prime NUmber
        System.out.print("Enter a number to check for prime number:");
        int p = sc.nextInt();
        int count=0;
        if(p==0||p==1){
            System.out.println("Not a prime number.");
        }
        else if(p==2){
            System.out.println("prime number");
        }
        else{
            for(int j=2;j<=Math.sqrt(p);j++){
                if(p%j==0) {
                    System.out.println(j);
                    System.out.println("Not a prime number");
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime number");
            }
        }

         */
        /*Prime number between any two number
        System.out.print("Enter a number:");
        int p = sc.nextInt();
        System.out.println("The Prime number between 1 to "+p+" are:");
        int count=0,i,j,n=0;
        for (i=2;i<=p;i++){
            count =0;
            for (j=2;j<=i/2;j++){
                if(i%j==0){
                    count=1;
                    break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
                n++;
            }
        }
        System.out.println("\nTotal prime number between 1 and "+p+" are: "+n);
         */

    }

        }

