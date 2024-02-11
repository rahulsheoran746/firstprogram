package com.company;
import java.util.*;
import java.util.stream.*;

//public class AdvanceJavaP3 {
//    public static void main(String[] args) {
//        User obj =new User.Builder("Rahul","Sheoran").setAge(23).setMob_no(7056525368L).build();
//        User obj1 =new User.Builder("Rahul1","Sheoran").setAge(25).build();
//        System.out.println(obj.getAge());
//    }
//}
//    class User {
//        private String fname, lname, address;
//        private int age;
//        private long mob_no;
//
//        private User(String fn, String ln, String add, int age, long mob) {
//            fname = fn;
//            lname = ln;
//            address = add;
//            this.age = age;
//            mob_no = mob;
//        }
//        public int getAge(){
//            return age;
//        }
//
//        public static class Builder {
//            String fname, lname, address;
//            int age;
//            long mob_no;
//
//            Builder(String fn, String ln) {
//                fname = fn;
//                lname = ln;
//            }
//
//            public Builder setAge(int a) {
//                age = a;
//                return this;
//            }
//
//            public Builder setMob_no(long l) {
//                mob_no = l;
//                return this;
//            }
//
//            public Builder setAddress(String s) {
//                address = s;
//                return this;
//            }
//
//            public User build() {
//                return new User(fname, lname, address, age, mob_no);
//            }
//        }
//    }
//public class AdvanceJavaP3 {
//    public static void main(String[] args) {
//        ArrayList <Employee1> al = new ArrayList<>();
////        Employee1 e1 = new Employee1("Aman", "Delhi", false);
////        al.add(e1);
//        al.add(new Employee1("Aman","Delhi",false));
//        Employee1 e2 = new Employee1("Dheeraj", "Punjab", true);
//        al.add(e2);
//        Employee1 e3 = new Employee1("Rajeev", "West Bengal", false);
//        al.add(e3);
//        Employee1 e4 = new Employee1("Deepti", "Delhi", true);
//        al.add(e4);
//        Employee1 e5 = new Employee1("Sandeep", "UP", false);
//        al.add(e5);
//
////Find the employees state-wise
//
//        Map <String, List<Employee1>> mp = al.stream().collect(Collectors.groupingBy(e -> e.state));
//        Set <String> keys = mp.keySet();
//        for(String k: keys)
//        {
//            List <Employee1> l = mp.get(k);
//            System.out.println("\nEmployees from " + k);
//            for(Employee1 e : l)
//                System.out.println(e.name + "\t" + e.state);
//        }
//
////Use partitioning based on Martial Status
//
//        Map <Boolean, List<Employee1>> mp1 = al.stream().collect(Collectors.partitioningBy( e -> e.married));
//        Set <Boolean> ks = mp1.keySet();
//        for(Boolean k: ks)
//        {
//            if( k)
//                System.out.println("\n\nMarried Employees are\n");
//            else
//                System.out.println("\n\nUnmarried Employees are\n");
//            List <Employee1> l = mp1.get(k);
//            for(Employee1 e : l)
//                System.out.println(e.name + "\t" + e.state);
//        }
//    }
//    }
//class Employee1
//{
//    String name, state;
//    boolean married;
//    Employee1(String name, String state, boolean ms)
//    {
//        this.name = name; this.state = state; married = ms;
//    }
//}
public class AdvanceJavaP3 {
    public static void main(String[] args) {
        User u1 = new User.Builder("Rahul","Sheoran").build();
        User u2 = new User.Builder("Ankit","Sheoran").setAge(23).setMob_No(9050323332L).build();
        System.out.println(u2.getAge());
        System.out.println(u1.getMob_no());
        System.out.println(u2.getMob_no());
        System.out.println(u2.getAddress());
        User.Builder i1 =new User.Builder("sd","sfa");
        System.out.println(i1.lname);
    }
}
class User{
    private String fname,lname,address;
    private int age;
    private long mob_no;
    private User(String f,String l,String add,int age,long mob_no){
        fname =f;
        lname=l;
        address=add;
        this.age=age;
        this.mob_no =mob_no;
    }
    public int getAge(){
        return age;
    }
    public long getMob_no(){
        return mob_no;
    }
    public String getAddress(){
        return address;
    }

    public static class Builder{
        String fname,lname,address;
        int age;
        long mob_no;
        Builder(String fname,String lname){
            this.fname= fname;
            this.lname =lname;
        }
        public Builder setAddress(String address){
            this.address =address;
            return this;
        }
        public Builder setAge(int i){
            age =i;
            return this;
        }
        public Builder setMob_No(long mob_no){
            this.mob_no =mob_no;
            return this;
        }
        public User build(){
            return new User(fname,lname,address,age,mob_no);
        }

    }
}


