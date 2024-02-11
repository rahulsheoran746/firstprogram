package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num1 = 45;
        int num2 = 35;
        int num3 = 25;
        //System.out.println(num1+num2+num3);
        int k = 'a' + 1;
        //System.out.println(k);
        String s = "Rahul";
       //System.out.println(s.length());
        int [] arr ={15,1,45,12,7};
        int [] arr1 = new int[5];
        int i =0;
        while(i< arr.length){
            if(arr[i]==i){
                System.out.println(i);
                arr1[i]=i;
            }
            else{
            }
            i++;
        }
        for(int e:arr1){
            System.out.println(e);
        }



    }
}
