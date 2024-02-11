package com.company;
//import java.io.StringBufferInputStream;
import java.util.*;
import java.util.stream.*;

public class AdvanceJavaP4 {
    public static void main(String[] args) {
        //reduction method
        int max =IntStream.of(10,20,30,50,7).max().getAsInt();
        System.out.println(max);
       Integer  [] arr ={90, 30, 50, 7, 36};
        Stream <Integer> st = Arrays.stream(arr);
        //sum of odd number from array using optional class
//        Optional <Integer> op = st.filter(x -> x%2 != 0).reduce( (a, b) -> a+b);
//        //if(op.isPresent()) System.out.println("Sum is "+ op.get());
//        op.ifPresent(x-> System.out.println("sum is "+x));

////sum of odd number from array
//         Integer result = st.filter(x -> x%2 != 0).reduce(0, (a, b) -> a+b);
//         System.out.println(result);


      //  sum of square of odd numbers from array;
        Integer result = st.filter(x -> x%2 != 0).reduce(0, (a, b) -> a+ b*b, (a, b) -> a+b);
        System.out.println(result);

    }
}
