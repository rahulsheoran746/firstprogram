package com.company;


import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

public class AdvanceJavaP1 {
    public static void main(String[] args) {
        //Day2
//        ArrayList<Employee> al =new ArrayList<>();
//        Employee e1 =new Employee("Ravi","Punjab",50000);
//        al.add(e1);
//        Employee e2 =new Employee("Roney","Haryana",30000);
//        al.add(e2);
//        Employee e3 =new Employee("Rishika","Punjab",20000);
//        al.add(e3);
//        Employee e4 =new Employee("Aman","Jammu",41000);
//        al.add(e4);
//        //Q1 Find out no of employees who are getting salary>=30000
//        Stream<Employee> stream = al.stream();
//        stream =stream.filter(emp->emp.salary>=30000);//we use lambda fxn here
////        long ans =stream.count();//count is termination fxn in stream class
////        System.out.println("No of employees who are geeting salary>=30k - "+ans);
//
//       // Printing these Employees
//       // we use foreach method of stream class
//       stream.forEach(emp->{
//           System.out.println(emp.name+"\t"+emp.city+"\t"+emp.salary);
//       });
//       //as we have used count(termination method) of stream so now stream is empty
//        //so we have to comment that code of count , for count we have to declare
//        // another varibale and use that in forEach method
//        // also forEach method of stream class is also termination method thats why we also dontuse
//        //count fxn of stream after forEach Method

//Day3
//        ArrayList<Integer> al =new ArrayList<>();
//        al.add(4);
//        al.add(3);
//        al.add(2);
//        al.add(1);
//        al.add(4);
//        al.add(8);
////        Stream<Integer> stream =al.stream();
////        stream =stream.distinct();
////        // stream =stream.sorted();//for ascending order
////       stream=stream.sorted((a,b)->b.compareTo(a));//for descending order
//     //   Stream<Integer> stream =al.stream().distinct().sorted((a,b)->b.compareTo(a));
//        Stream<Integer> stream =al.stream().distinct().sorted((a,b)-> {if (a>b) return -1; else if(b>a) return 1; else return 0;});
//
//        stream.forEach(e-> System.out.println(e));

        ArrayList<Employee> al =new ArrayList<>();
        Employee e1 =new Employee("Ravi","Punjab",50000);
        al.add(e1);
        Employee e2 =new Employee("Roney","Haryana",30000);
        al.add(e2);
        Employee e3 =new Employee("Rishika","Punjab",20000);
        al.add(e3);
        Employee e4 =new Employee("Aman","Jammu",41000);
        al.add(e4);
        Stream<Employee> stream =al.stream();
        stream=stream.filter(emp->emp.salary>20000);
        stream.forEach(emp->{
            System.out.println(emp.name+"\t"+emp.city+"\t"+emp.salary);
        });


    }

}
 class Employee extends Object{
    String name,city;
    int salary;
    Employee(String name,String city,int sal){
        //this is used for name conflict
        this.name =name;
        this.city =city;
        salary=sal;
    }
}
