package com.company;

import java.util.Scanner;

public class PractiseSet6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Q1
        float [] f1 = {12.5f,13.5f,14.5f,15.5f,16.5f};
        float sum=0;
        for (float e1:f1) {
            sum= sum+e1;
        }
        System.out.println("the sum is "+sum);
         */
        /*Q2
        System.out.print("Enter number:");
        int n= sc.nextInt();
        int [] i1 = {1,2,3,4,5,6,7};
        boolean b=false;
        for(int e:i1){
            if(e==n){
                System.out.println(n+" is present in array");
                b = true;
                break;
            }
        }
        if(b==false){
            System.out.println("Not present in array");
        }

         */
        /*Q3
        int[] b1 =new int[10];
        float avg=0,sum=0;
        for(byte i=0;i<b1.length;i++){
            System.out.print("Enter marks of S"+(i+1)+" Student:");
            b1[i]= sc.nextByte();
        }
        for (int e:b1) {
            sum= sum+e;
        }
        avg= sum/b1.length;
        System.out.println("Total sum is "+sum);
        System.out.println("Average is:"+ avg);

         */


        /* Q4
//        int [][] m1 = {{1,2,3},{4,5,6}};
//        int [][] m2 = {{1,2,3},{4,5,6}};
        int [][] s1 = new int[2][3];
        int [][] m1 = new int[2][3];
        int [][] m2 = new int[2][3];
        System.out.println("Code for user input for m1 array.");
        for(int i=0;i<m1.length;i++){
            for (int j=0;j<3;j++){
                System.out.printf("Enter m1[%d][%d] element:",i,j);
                int i1=sc.nextInt();
                m1[i][j]=i1;
            }
        }
        System.out.println("Code for user input for m2 array.");
        for(int i=0;i<m2.length;i++){
            for (int j=0;j<3;j++){
                System.out.printf("Enter m2[%d][%d] element:",i,j);
                int i1=sc.nextInt();
                m2[i][j]=i1;
            }
        }

        System.out.println("M1 array in form of Matrix");
        for(int i=0;i<m1.length;i++){
            for (int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("M2 array in form of Matrix");
        for(int i=0;i<m2.length;i++){
            for (int j=0;j<m2[i].length;j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
       //Code for sum of array
        for(int i=0;i< m1.length;i++){
            for (int j=0;j<m1[0].length;j++){
                s1[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("Resultant array of m1+m2 is :");
        for(int i=0;i<s1.length;i++){
            for (int j=0;j<s1[i].length;j++){
                System.out.print(s1[i][j]+" ");
            }
            System.out.println();
        }

         */
        /*Q5
        int [] a1 = new int[5];
        a1[0]=5;
        a1[1]=10;
        a1[2]=15;
        a1[3]=20;
        a1[4]=25;
        int temp;
        int [] reva1= new int[a1.length];
       for(int i=0;i<a1.length;i++){
           reva1[i]=a1[a1.length-i-1];
       }
       //Print reverse array
        System.out.println("Array in reverse order");
        System.out.print("{");
        for(int e:reva1){
            System.out.print(+e+",");
        }
        System.out.print("}"+"\n");
       // SECOND METHOD using only one array
        for(int i=0;i<Math.floorDiv(a1.length,2);i++){
            temp=a1[i];
            a1[i]=a1[a1.length-i-1];
            a1[a1.length-i-1]=temp;
        }
        for(int e:a1){
            System.out.print(e+" ");
        }

         */
        
        /* Q6
        int [] a1 = {3,20,108,4,49};
        System.out.print("Array elements are:");
        for (int e:a1) {
            System.out.print(e+" ");
        }
        System.out.println();
        //Find maximum in Array
        int max=a1[0];
        for(int i=0;i<a1.length-1;i++){
            if(max<a1[i+1]){
                max=a1[i+1];
            }
        }
        System.out.println("The maximum value is:"+max);

         */
        /*Q7
        int [] a1 = {67,20,5,4,49};
        System.out.print("Array elements are:");
        for (int e:a1) {
            System.out.print(e+" ");
        }
        System.out.println();
        //Find minimum in Array
        int min=a1[0];
        for(int i=0;i<a1.length-1;i++){
            if(min>a1[i+1]){
                min=a1[i+1];
            }
        }
        System.out.println("The minimum value is:"+min);

         */
        /*Q8  SORTED ARRAY or Not
        int[] a1 ={20,16,10,9,6};
        int count1=0,count2=0;

        for(int i =0;i<a1.length-1;i++){
            if(a1[i]<a1[i+1]){
                count1++;
            }

        }
        for(int i =0;i<a1.length-1;i++){
            if(a1[i]>a1[i+1]){
                count2++;
            }
        }

        if(count1==(a1.length-1)||count2==(a1.length-1)){
            System.out.println("It is sorted array");
        }
        else{
            System.out.println("It is not sorted array");
        }

         */
        //Q9 SORTED ARRAY
        int[] a1={9,11,1,4,8,6,1};
        int temp;
        System.out.println("Original array is:");
        for(int e1:a1){
            System.out.print(e1+" ");
        }
        System.out.println();
        for(int j=0;j<a1.length;j++){
        for(int i =0;i<a1.length-1;i++){
            if(a1[i]<=a1[i+1]){
            }
            else{
                temp=a1[i];
                a1[i]=a1[i+1];
                a1[i+1]=temp;
            }
        }
        }
        System.out.println("Sorted array is:");
        for(int e:a1){
            System.out.print(e+" ");
        }


        /*fibonacci series
        int n1=0,n2=1,n3,count=10;
        System.out.println("the first "+(count+2) +" numbers of fibonacci Series are:");
        System.out.print("0 "+"1 "+" ");
        for(int i=0;i<count;i++){
            n3=n2+n1;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }

         */




















    }
}
