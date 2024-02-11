package com.company;
import java.util.ArrayList;
import java.util.Stack;

public class Stack_Implementation {
//    public static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            next=null;
//        }
//    }
//    public static class StackUsingLL{
//        Node head=null;
//        public boolean isEmpty(){
//            return head==null;
//        }
//        public void push(int data){
//            Node newNode =new Node(data);
//            if(isEmpty()){
//                head=newNode;
//                return;
//            }
//            newNode.next=head;
//            head=newNode;
//        }
//        public int pop(){
//
//            if(isEmpty()) return -1;
//            int top = head.data;
//            head=head.next;
//            return top;
//        }
//        public int peek(){
//            if(isEmpty()) return -1;
//            return head.data;
//        }
//
//    }
    static class StackUsingAl{
      ArrayList<Integer> al =new ArrayList<>();
     public boolean isEmpty(){
         return al.size()==0;
     }
     public void push(int data){
         al.add(data);
     }
     public int pop(){
         if(isEmpty()) return -1;
         int top =al.get(al.size()-1);
         al.remove(al.size()-1);
         return top;
     }
     public int peek(){
         if(isEmpty()) return -1;
         return al.get(al.size()-1);
     }
}
    public static  void pushAtBottom(int data,Stack<Integer> s1){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top =s1.pop();
        pushAtBottom(data, s1);
        s1.push(top);
    }
    public static void reverseStack(Stack<Integer> s1){
        if(s1.isEmpty()) return;
        int top =s1.pop();
        reverseStack(s1);
        pushAtBottom(top,s1);

    }


    public static void main(String[] args) {
//        StackUsingLL l1 =new StackUsingLL();
//        l1.push(1);
//        l1.push(2);
//        l1.push(3);
//        l1.push(4);
//        while(!l1.isEmpty()){
//            System.out.println(l1.peek());
//            l1.pop();
//        }
//
//        StackUsingAl l1 =new StackUsingAl();
//        l1.push(1);
//        l1.push(2);
//        l1.push(3);
//        l1.push(4);
//        while(!l1.isEmpty()){
//            System.out.println(l1.peek());
//            l1.pop();
//        }
       // pushAtBottom question
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4,s);
        reverseStack(s);
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
        for(int e:s) {
            System.out.println(e);
        }
        s.forEach(x-> System.out.println(x));





    }
}

