package com.company;

import java.util.Scanner;

public class PractiseSet7 {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.print(n*i+" ");
        }
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sumOfNaturalNumber(int n){
        int sum=n;
        if(n==0){
            return 0;
        }
        else{
        return sum+sumOfNaturalNumber(n-1);
    }
    }
    static int nthElementOfFibonacci(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
        if(n==0||n==1){
            return n-1;
        }
       else{
           return nthElementOfFibonacci(n - 1) + nthElementOfFibonacci(n - 2);
        }

    }
    static float avg(int ...arr){
        int sum=0;
        int b=0;
        for(int e:arr){
            sum +=e;
            b++;
        }
        return (float)sum/b;
    }
    static void pattern3(int n){
      int i=0;
      if(n>0){
          pattern3(n-1);
          while(i<n){
          System.out.print("* ");
          i++;
      }
          System.out.println();
    }
    }
    static void pattern4(int n){
        if(n>0){
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
            pattern4(n-1);
        }
    }
    static float changeCelsiusToFahrenheit(float c){
        return (9.0f*c/5)+32;
    }
    static int sumOfNaturalNumber1(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Fibonacci series using recursion
        /*
        System.out.print("Enter number: ");
        int n =sc.nextInt();
        System.out.println("The first "+n+" numbers of Fibonacci series are: ");
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
         */
        /*Q1 Multiplication table
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.printf("The table of %d is : ",n);
        table(n);

         */
        /*Q2
        System.out.print("Enter number of rows you want in star pattern:");
        int n= sc.nextInt();
        pattern1(n);

         */
        /*Q3
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int sum= sumOfNaturalNumber(n);
        System.out.printf("The sum of first  %d natural number is: ",n);
        System.out.println(sum);

         */

        /*Q4
        System.out.print("Enter number of rows you want in star pattern:");
        int n= sc.nextInt();
        pattern2(n);

         */

        /*Q5 nth element of fibonacci series
        // 0 1 1 2 3 5 8 13 21 34
        System.out.print("Enter number:");
        int n= sc.nextInt();
        int f1 = nthElementOfFibonacci(n);
        System.out.println("The "+n+"th term of fibonacci series is: "+f1);

         */

        /*Q6
        int[] arr1={2,3,4,5,6,90};
        float n= avg(arr1) ;
        System.out.println(" The average of these no is: "+n);

         */
        /*Q7
        System.out.print("Enter no of rows for pattern:");
        int n =sc.nextInt();
        pattern3(n);

         */
        /*Q8
        System.out.print("Enter no of rows for pattern: ");
        int n =sc.nextInt();
        pattern4(n);

         */


        /*Q9
        System.out.print("Enter Celsius(degree) : ");
        float c1= sc.nextFloat();
        System.out.print(c1+" degree celsius is equal to ");
        float  f1 = changeCelsiusToFahrenheit(c1);
        System.out.println(f1+" degree fahrenheit.");
         */


        /*Q10
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int sum= sumOfNaturalNumber1(n);
        System.out.printf("The sum of first  %d natural number is: ",n);
        System.out.println(sum);
         */




        





    }
}
