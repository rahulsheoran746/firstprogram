package com.company;

//    public class LinkedList_Implementation {
//        Node head;
//        private int size;
//
//        public LinkedList_Implementation() {
//            size=0;
//        }
//
//        static class Node{
//            String data;
//            Node next;
//            Node(String data) {
//                this.data = data;
//                this.next = null;
//            }
//        }
//        public void addFirst(String data){
//            Node newNode = new Node(data);
//            size++;
//            if(head==null){
//                head=newNode;
//                return;
//            }
//            newNode.next= head;
//            head= newNode;
//
//        }
//        public void addLast(String data){
//            Node newNode = new Node(data);
//            size++;
//            if(head==null){
//                head =newNode;
//                return;
//            }
//            Node currNode =head;
//            while(currNode.next!=null){
//                currNode=currNode.next;
//            }
//
//            currNode.next=newNode;
//
//
//        }
//        public void printList(){
//            if(head==null){
//                System.out.println("List is empty");
//                return;
//            }
//            Node currNode= head;
//            while(currNode!=null){
//                System.out.print(currNode.data+" -> ");
//                currNode=currNode.next;
//            }
//            System.out.println("NULL");
//        }
//        public void deleteFirst(){
//            if(head==null){
//                System.out.println("List is empty");
//                return;
//            }
//            size--;
//            head= head.next;
//        }
//        public void deleteLast(){
//            if(head==null){
//                System.out.println("List is empty");
//                return;
//            }
//            size--;
//            if(head.next==null){//case only one element in linkedlist
//                head =null;
//                return;
//            }
//            Node secLastNode =head;
//            Node lastNode =head.next;
//            while(lastNode.next!=null){
//                secLastNode=lastNode;
//                lastNode=lastNode.next;
//            }
//            secLastNode.next=null;
//        }
//        public int listSize(){
//            return size;
//
//        }
//        //reverse a list iteratively
//        public void reverseList(){
//            if(head==null||head.next==null) return;
//            Node prevNode = head;
//            Node currNode =head.next;
//            while(currNode!=null){
//                Node nextNode =currNode.next;
//                currNode.next=prevNode;
//                // update
//                prevNode= currNode;
//                currNode=nextNode;
//            }
//            head.next=null;
//            head =prevNode;
//        }
//        //reverse a list recursively
//        public Node reverseRecursive(Node head){
//            if(head==null||head.next==null) return head;
//            Node newHead =reverseRecursive(head.next);
//            head.next.next=head;
//            head.next=null;
//            return newHead;
//        }
//
//    public static void main(String[] args) {
//        LinkedList_Implementation l1 =new LinkedList_Implementation();
//        l1.addFirst("rahul");
//        l1.addFirst("is");
//        l1.addFirst("This");
//        l1.addLast("code");
//        l1.printList();
//        System.out.println(l1.listSize());
//        l1.reverseList();
//        l1.printList();
//        l1.head= l1.reverseRecursive(l1.head);
//        System.out.println(l1.head.data);
//        l1.printList();
//
//    }
//}

    public class LinkedList_Implementation{
        Node head;
        private int size;
        public LinkedList_Implementation(){
            this.size=0;
        }
        static class Node{
            String data;
            Node next;
            public Node(String d){
                this.data=d;
                this.next =null;
            }
        }
        public void addFirst(String data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head =newNode;
                return;
            }
            newNode.next =head;
            head =newNode;
        }
        public void addLast(String data){
            Node newNode =new Node(data);
            size++;
            if(head==null){
                head =newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next!=null){
                currNode =currNode.next;
            }
            currNode.next =newNode;
        }
        public void printList(){
            if(head==null){
                System.out.println("There is no element in list");
                return;
            }
            Node currNode =head;
            while(currNode!=null){
                System.out.print(currNode.data+" -> ");
                currNode =currNode.next;
            }
            System.out.println("NULL");
        }
        public void deleteFirst(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            size--;
            head = head.next;
        }
        public void deleteLast(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            size--;
            if(head.next==null){
                head =null;
                return;
            }
            Node secondLastNode =head;
            Node lastNode =head.next;
            while(lastNode.next!=null){
                secondLastNode =lastNode;
                lastNode =lastNode.next;
            }
            secondLastNode.next=null;
        }
        public int getSize(){
            return size;
        }
        public void reverseLinkedListIteratively(){
            if(head==null||head.next==null) return;
            Node prevNode =head;
            Node currNode = prevNode.next;
            while(currNode!=null){
                Node nextNode =currNode.next;
                currNode.next =prevNode;
                //update
                prevNode =currNode;
                currNode =nextNode;
            }
            head.next = null;
            head =prevNode;
        }
        public Node reverseLinkedListRecursively(Node head){
            if(head==null||head.next==null)return head;
            Node newHead = reverseLinkedListRecursively(head.next);
            head.next.next = head;
            head.next =null;
            return newHead;
        }
        public static void main(String[] args) {
            LinkedList_Implementation linkedList_implementation = new LinkedList_Implementation();
            linkedList_implementation.addFirst("1");
            linkedList_implementation.addLast("2");
            linkedList_implementation.addLast("3");
            linkedList_implementation.printList();
            linkedList_implementation.head = linkedList_implementation.reverseLinkedListRecursively(linkedList_implementation.head);
            linkedList_implementation.printList();
        }
    }


