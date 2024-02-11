package com.company;
import java.util.*;

public class RecursionEasyQuestions {
    public static void print1To5(int n){
        if(n==6){
            return;
        }
        System.out.print(n+" ");
        print1To5(n+1);
    }
    public static void print5To1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print5To1(n-1);
    }
    public static int calFactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int nM1Factorial =calFactorial(n-1);
        int nFactorial = n *nM1Factorial;
        return nFactorial;
    }
    public static int naturalNOSum(int n){
        if(n==0){
            return 0;
        }
        int nM1Sum = naturalNOSum(n-1);
        int nSum =n+nM1Sum;
        return nSum;
    }
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
    public static void fibonacciSeries(int a, int b, int n){
        if(n==0){
            return;
        }
        int c =a+b;
        System.out.print(c+" ");
        fibonacciSeries(b,c,n-1);
    }
    public static int xToPowerN(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xtoPowerNm1 = xToPowerN(x,n-1);
        int finalValue = x * xtoPowerNm1;
        return finalValue;
    }
    public static int xToPowerNwithLogNheight(int x ,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return xToPowerNwithLogNheight(x ,n/2) * xToPowerNwithLogNheight(x,n/2);
        }
        else{
            return x * xToPowerNwithLogNheight(x ,n/2) * xToPowerNwithLogNheight(x,n/2);
        }
    }
    public  static void towerOfHanoi(int n , String source ,String helper ,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+source+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,source,dest,helper);//n-1 disks from source to helper
        System.out.println("transfer disk "+n+" from "+source+" to "+dest);
        towerOfHanoi(n-1,helper,source,dest);//n-1 disks from helper to dest taking source as helper
    }
    public static void printReverseString(String original,int idx ,String newString){
        if(idx==0){
            newString+=original.charAt(idx);
            System.out.println(newString);
            return;
        }
        newString += original.charAt(idx);
        printReverseString(original,--idx,newString);
    }
    public static int firstIdx=-1;
    public static int lastIdx =-1;
    public static void firstAndLastOccurence(String str, int idx,char ch){
        if(idx==str.length()){
            System.out.println("First index of " +ch+" is "+firstIdx);
            System.out.println("Last index of " +ch+" is "+lastIdx);
            return;
        }
        if(ch==str.charAt(idx)){
            if(firstIdx==-1){
                firstIdx =idx;
                lastIdx= idx;
            }
            else {
                lastIdx =idx;
            }
        }
        firstAndLastOccurence(str,idx+1,ch);
    }
    public static boolean arrayIsSortedStrictly(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
//        if(arr[idx]<arr[idx+1]){
//            //array is sorted till now
//            return arrayIsSortedStrictly(arr,idx+1);
//        }
//        else{
//            return false;
//        }
        if(arr[idx]>=arr[idx+1])//array is unsorted
            return false;

        return arrayIsSortedStrictly(arr,idx+1);
    }
    public static void moveAllXtoLast(String originalStr,int idx, String newString,int count){
        if(idx==originalStr.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if(originalStr.charAt(idx)!='x'){
            newString+=originalStr.charAt(idx);
            moveAllXtoLast(originalStr,idx+1,newString,count);
        }
        else{
            count++;
            moveAllXtoLast(originalStr,idx+1,newString,count);
        }
    }
    public static boolean[] alphabetArray =new boolean[26];
    public static void removeDuplicates(String originalString ,int idx, String newString){
        if(idx==originalString.length()){
            System.out.println(newString);
            return;
        }
        char ch =originalString.charAt(idx);
        if(alphabetArray[ch-'a']){
            removeDuplicates(originalString,idx+1,newString);
        }
        else{
            newString+=ch;
            alphabetArray[ch-'a']=true;
            removeDuplicates(originalString,idx+1,newString);
        }
    }
    public static void printSubsequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be want with newString
        printSubsequences(str,idx+1,newString+currChar);
        //not to be want with newString
        printSubsequences(str,idx+1,newString);
    }
    public static void printUniqueSubsequences(String str ,int idx, String newString,HashSet<String> set){
        if(idx==str.length()){
            if(!set.contains(newString)){
                System.out.println(newString);
                set.add(newString);
                return;
            }
            else{
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be want with newString
        printUniqueSubsequences(str,idx+1,newString+currChar,set);
        //to be not want with newString
        printUniqueSubsequences(str,idx+1,newString,set);
    }
    public static  String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKeypadCombination(String str ,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar =str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printKeypadCombination(str,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        //Q1 print number from 1 to 5
        int n1=1;
        print1To5(n1);
        System.out.println();
        //Q2 print number from 5 to 1
        int n2=5;
        print5To1(n2);
        System.out.println();
        //Q3 factorial of a number
        int n3 =5;
        int ans = calFactorial(n3);
        System.out.println(ans);
        //Q4 sum of first n natural numbers
        int n4 =5;
        int naturalNumberSum = naturalNOSum(n4);
        System.out.println(naturalNumberSum);
        //Q4 second method
        int n5 =6;
        printSum(1,n5,0);
        //Q5 fibonacci series
        int n6 =10;
        System.out.print(0 +" "+ 1+ " ");
        fibonacciSeries(0,1,n6-2);
        //Q6 print x^n (stack height = n)
        int x1 =6;
        int n7 =3;
        int value = xToPowerN(x1,n7);
        System.out.println();
        System.out.println(value);
        //Q7 print x^n (stack height = log(n) )
        int x2 =2;
        int n8 =6;
        int value2 =xToPowerNwithLogNheight(x2,n8);
        System.out.println(value2);
        //Q8 Tower of Hanoi
        int noOfDisks=3;
        towerOfHanoi(noOfDisks,"Source","Helper","Dest");
        //Q9 Print a string in reverse
        String str1 ="abcd";
        printReverseString(str1,str1.length()-1,"");
        //Q10 find the 1st and last occurrence of a character in string
        String str2 ="abaacdaefaah";
        firstAndLastOccurence(str2,0,'a');
        //Q11 check if array is sorted (Strictly increasing)
        int[] arr1 ={1,2,3,4,5,6};
        boolean isSorted = arrayIsSortedStrictly(arr1,0);
        if(isSorted)
            System.out.println("array is Sorted increasingly strictly.");
        else
            System.out.println("array is  not Sorted increasingly strictly.");
        //Q12 move all x of a string to last
        String str3 = "axbcxxd";
        moveAllXtoLast(str3,0,"",0);
        //Q13 remove duplicates from a string
        String str4 ="abbccda";
        removeDuplicates(str4,0,"");
        //Q14 print all the subsequences of a string
        String str5 ="abc";
        System.out.println("subsequences of "+str5+" are: ");
        printSubsequences(str5,0,"");
        //Q15 print all unique subsequences of a string
        String str6 ="aabc";
        System.out.println(" Unique subsequences of "+str6+" are: ");
        HashSet<String> set =new HashSet<>();
        printUniqueSubsequences(str6,0,"",set);
        //Q16  print keypad combination
        String str7 ="23";
        System.out.println("keypad combination for "+str7+" are: ");
        printKeypadCombination(str7,0,"");







    }
}
