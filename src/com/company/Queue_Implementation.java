package com.company;

public class Queue_Implementation {
    // queue using simple array here dequeue TC is O(n)
//    static class QueueY{
//        static int[] arr;
//        static int size;
//        static int rear=-1;
//        QueueY(int n){
//            arr =new int[n];
//            this.size =n;
//        }
//        public static boolean isEmpty(){
//            return rear==-1;
//        }
//        static void enqueue(int data){
//            if(rear==size-1){ System.out.println("Queue is full");
//                return;}
//            rear++;
//            arr[rear] =data;
//        }
//        static int  remove(){
//            if(isEmpty()) return -1;
//            int front =arr[0];
//            for(int i=0;i<rear;i++){
//                arr[i]=arr[i+1];
//            }
//            rear--;
//            return front;
//        }
//        public static int peek(){
//            if(isEmpty()) return -1;
//            return arr[0];
//        }
//
//    }
        // Queue using circular array which takes O(1) TC in all operation
//    static class QueueY{
//        static int[] arr;
//        static int size;
//        static int front=-1;
//       static int rear=-1;
//       QueueY(int size){
//           arr =new int[size];
//           this.size=size;
//       }
//       public static boolean isEmpty(){
//           return rear==-1&&front==-1;
//       }
//       public static boolean isFull(){
//         return (rear+1)==front;
//       }
//       public static void enqueue(int data){
//           if(isFull()){
//               System.out.println("Queue is full");
//               return;
//           }
//           if(front==-1){
//               front=0;
//           }
//           rear=(rear+1)%size;
//           arr[rear]=data;
//       }
//       public static int remove(){
//           if(isEmpty()) return -1;
//           int ans =arr[front];
//           if(front==rear){
//               front=rear=-1;
//           }
//           else {
//               front = (front + 1) % size;
//           }
//           return ans;
//       }
//       public static int peek(){
//           if(isEmpty()) return -1;
//           return arr[front];
//       }
//    }

    // Queue using LInked LIst all operation in O(1) TC
     static class Node{
         int data;
         Node next;
         Node(int data){
             this.data=data;
             this.next=null;
         }
    }
    static class QueueY{
         static Node head=null;
         static Node tail=null;
        public static boolean isEmpty(){
            return head==null&&tail==null;
        }
         public void enqueue(int data){
             Node newNode  =new Node(data);
           if(tail==null){
               tail=head=newNode;
               return;
           }
           tail.next=newNode;
           tail= newNode;
         }
        public static int remove(){
            if(isEmpty()) return -1;
            int ans =head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return ans;
        }
        public static int peek(){
            if(isEmpty()) return -1;
            return head.data;
        }
    }
    public static void main(String[] args) {
         QueueY q =new QueueY();
         q.enqueue(1);
         q.enqueue(2);
         q.enqueue(3);
         q.enqueue(4);
         q.enqueue(5);
         q.remove();
         q.remove();
        q.enqueue(6);
        q.remove();
        q.remove();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
}

