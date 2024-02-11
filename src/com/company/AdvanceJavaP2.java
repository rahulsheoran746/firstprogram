package com.company;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

//public class AdvanceJavaP2 {
//    public static void main(String[] args) {
//        Student[] student =new Student[5];
//        student[0] = new Student("Amit", 8.12, 7008981191L);
//        student[1] = new Student("Ravi", 5.11, 7005989156L);
//        student[2] = new Student("Dheeraj", 5.11, 7005989251L);
//        student[3] = new Student("Farhan", 5.11, 8273598100L);
//        student[4] = new Student("Hardik", 5.11, 9103450091L);
//
//        ArrayList<Contact> phonebook = new ArrayList<>();
//        Stream<Student> st = Arrays.stream(student);
//        Stream<Contact> cont =st.map(x->new Contact(x.name,x.mobile_no));
//        cont.forEach(c->phonebook.add(c));
//        //Printing contact list
//        for(Contact e:phonebook){
//            System.out.println(e.contact_name+"\t"+e.contact_no);
//        }
//
//    }
//}
//
//class Student{
//    String name;
//    double cgpa;
//    long mobile_no;
//    Student(String n,double c,long m){
//        name =n;
//        cgpa =c;
//        mobile_no=m;
//    }
//}
//class Contact{
//    String contact_name;
//    long contact_no;
//    Contact(String c,long l1){
//        contact_name =c;
//        contact_no =l1;
//    }
//}
//public class AdvanceJavaP2 {
//    public static void main(String[] args) {
//        ArrayList<Student> student =new ArrayList<>(5);
//        student.add(new Student("A",5.19));
//        student.add(new Student("C",6.85));
//        student.add(new Student("E",6.72));
//        student.add(new Student("D",6.60));
//        student.add(new Student("B",6.79));
////        Stream<Student> st= student.stream();
////        st= st.filter(x->x.cgpa>=6.7);
////        st=st.sorted((a,b)->(a.name.compareTo(b.name)));
////        st.forEach(x-> System.out.println(x.name));
//        Stream<Student> st =student.stream();
//        st.filter(x->x.cgpa>=6.7).sorted((a,b)->(a.name.compareTo(b.name))).forEach(x-> System.out.println(x.name+"\t"+x.cgpa));
//
//    }
//}
//class Student{
//    String name;
//    double cgpa;
//    Student(String n,double c){
//        name =n;
//        cgpa =c;
//    }
//}
public class AdvanceJavaP2 {
    public static boolean isPrime(Integer number){
        return number>1&& IntStream.range(2,number).noneMatch(x->number%x==0);
    }

    public static void main(String[] args) {
        Integer  [] arr = {3, 9, 5, 7, 7, 13, 61,4,6,8};

//Find the smallest Even Number

        Stream <Integer> st = Arrays.stream(arr);
        Optional<Integer> op = st.filter(x -> x%2 == 0).min((a, b) -> a.compareTo(b));
        op.ifPresent(x -> System.out.println(x));
        System.out.println(isPrime(2));


        //we reduce the code of these below three lines by using ifPresent method above it;

//         if(op.isPresent())
//            System.out.println(op.get());
//        else System.out.println("No Even Number Found");
        // find out prime number from arr
        ArrayList<Integer> al =new ArrayList<>();
      for(Integer e:arr){
          if(isPrime(e)){
              al.add(e);
          }
      }
      Stream<Integer> prim =al.stream().distinct();
      prim.forEach(x-> System.out.print(x+" "));

    }
}

