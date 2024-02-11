package com.company;

import java.util.*;

public class RecursionMediumQuestions {
    public static void printPermutations(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar =str.charAt(i);
            String newStr =str.substring(0,i)+str.substring(i+1);
            printPermutations(newStr,perm+currChar);
        }
    }
    public static int countAllPathsForMaze(int iIdx ,int jIdx,int n,int m){
        if(iIdx==n-1||jIdx==m-1) return 1;
        if(iIdx==n || jIdx==m) return 0;
        //if move right
        int rightPaths = countAllPathsForMaze(iIdx+1,jIdx,n,m);
        //if move downward
        int downPaths =countAllPathsForMaze(iIdx,jIdx+1,n,m);

        return rightPaths+downPaths;
    }
    public static int noOfWaysToPlaceTiles(int n,int m){
        if(n==m) return 2;
        if(n<m) return 1;
        //horizontally place of first tile
        int horizontalPlacement =noOfWaysToPlaceTiles(n-1,m);
        //vertically place of first tile
        int verticallyPlacement =noOfWaysToPlaceTiles(n-m,m);
        return horizontalPlacement+verticallyPlacement;
    }
    public static int noOfWaysToInviteNpeopleToParty(int n){
        if(n<=1) return 1;

        //if we invite single person then
        int ways1 =noOfWaysToInviteNpeopleToParty(n-1);
        //if we invite in pairs
         /* if we choose one person then we have choice of n-1 person to choose as its pair.
           and now we call the function for remaining n-1 persons */
        int ways2 =(n-1)*noOfWaysToInviteNpeopleToParty(n-2);
        return ways1+ways2;
    }
    public static void printSubset(ArrayList<Integer> list){
        for(int i:list){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void printAllSubsetOfFirstN_NaturalNumbers(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        //if we want to add
        subset.add(n);
        printAllSubsetOfFirstN_NaturalNumbers(n-1,subset);
        // we don't want to add
        subset.remove(subset.size()-1);// we have to remove last element from arraylist
        printAllSubsetOfFirstN_NaturalNumbers(n-1,subset);
    }
    public static void printAllSubsequences(String str, String newString, int index){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        //add hoga
        char currChar =str.charAt(index);
        printAllSubsequences(str,newString+currChar,index+1);
        //add nahi hoga
        printAllSubsequences(str,newString,index+1);
    }


    public static void main(String[] args) {
        //Q1 print all permutations of a String
        String str1 = "abcd";
        System.out.println("All possible permutation of "+str1+" are: ");
        printPermutations(str1,"");
        //Q2 count total path in a maze to move from (0,0) to (n,m)
        //   condition it can move right or down only
        int n=3,m=4;
        System.out.printf("Total paths to move from (0,0) to (%d,%d) are: ",n,m);
        int totalPaths= countAllPathsForMaze(0,0,n,m);
        System.out.println(totalPaths);
        // Q3 Place tiles of size 1Xm in a floor of size nXm
        int n1=4,m1=2;
        System.out.printf("Total no of ways to place tile of size (1X%d) on floor of size(%dX%d) is: ",m1,n1,m1);
        int totalWaysForTiles =noOfWaysToPlaceTiles(n1,m1);
        System.out.println(totalWaysForTiles);
        //Q4 find no of ways you can invite n person in party single or in pairs
        int noOfPeople = 4;
        System.out.printf("Total no of ways to invite %d person to party single or in pairs are: ",noOfPeople);
        int totalWaysForPeople = noOfWaysToInviteNpeopleToParty(noOfPeople);
        System.out.println(totalWaysForPeople);
        //Q5  print all the subset of a set of first N natural number
        int lastNaturalNumber =3;
        ArrayList<Integer> subset =new ArrayList<>();
        System.out.printf("All subset of first %d natural numbers are: \n",lastNaturalNumber);
        printAllSubsetOfFirstN_NaturalNumbers(lastNaturalNumber,subset);
        //Q6 print all subsequences of string
        String str = "abc";
        System.out.println("All subsequences of "+str+" are: ");
        printAllSubsequences(str,"",0);
    }
}
