package com.company;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
class Mobile{
    int price;
    int ram;
    String model;
    String os;
    Mobile(int price,int ram,String m,String os){
        this.price =price;
        this.ram=ram;
        model=m;
        this.os=os;
    }
}

public class MobileStore {
    public static void main(String[] args) {

        ArrayList<Mobile> al =new ArrayList<>();
        al.add(new Mobile(15000,4,"realme","android"));
        al.add(new Mobile(16000,6,"vivo","android"));
        al.add(new Mobile(50000,4,"iphone","ios"));
        al.add(new Mobile(35000,6,"oneplus","android"));
        al.add(new Mobile(19000,8,"redmi","android"));
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your starting budget ");
        int b =sc.nextInt();
        System.out.println("Enter your ending budget");
        int b2 =sc.nextInt();
        System.out.println("Enter minimum RAM you want");
        int r =sc.nextInt();
        Stream<Mobile> stream=al.stream();
        stream=stream.filter(x->x.ram>=r).filter(x->x.price>=b).filter(x->x.price<=b2);
//        Map<String,List<Mobile>> mp1 =stream.collect(Collectors.groupingBy(x->x.os));
//        Set<String> k =mp1.keySet();
//        for(String s :k){
//            if(s.equals("android")){
//                System.out.println("Android phones are:");
//            }
//            else{
//                System.out.println("ios phones are");
//            }
//            List<Mobile> l1 =mp1.get(s);
//            for(Mobile m:l1){
//                System.out.println(m.price+"\t"+m.ram+"\t"+m.model+"\t"+m.os);
//            }
//        }
        List<Mobile> l1 =stream.collect(Collectors.toList());
        for(Mobile m:l1){
            System.out.println(m.price+"\t"+m.ram+"\t"+m.model+"\t"+m.os);
        }

//        stream.forEach(x->{
//            System.out.println(x.price+"\t"+x.ram+"\t"+x.model+"\t"+x.os);
//        });

    }
}
