package com.company;

public class BinarySearchTree_Implementation {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    //insert in BinarySearch tree
    public static Node insert(Node root, int val){
        if(root==null){
            root =new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left,val);
        }
        else{//root.data<val
            //right subtree
            root.right =insert(root.right,val);
        }
        return root;
    }
    //Search in Binary Search Tree O(height of tree)
    public static boolean search(Node root,int key){
        if(root==null) return false;
        if(root.data>key){
            //search in left subtree
            return search(root.left,key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            //search in right subtree
            return search(root.right,key);
        }
    }
    //delete a node in BST
    //case1-0 child= delete node & return null to parent
    //case2-1 child= delete node and replace with child Node
    //case3- 2 child= replace value with inOrder Successor & delete node for inorder successor
    public static Node delete(Node root,int val){
        if(root.data>val){
            //left subtree
            root.left= delete(root.left,val);
        }
        else if(root.data<val){
            root.right =delete(root.right,val);
        }
        else{
            //root.data==val
            //case1
            if(root.left==null && root.right==null) return null;
            //case2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case3
            Node inorderSucc= inOrderSuccessor(root.right);
            root.data =inorderSucc.data;
            root.right =delete(root.right,inorderSucc.data);
        }
        return root;
    }
    public static Node inOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }



    //inorder of binary search tree always gives increasing order
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        //insertion in binary search tree
        int [] value={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<value.length;i++){
            root=insert(root,value[i]);
        }
        //inorder of BST gives sorted increasing order
        inOrder(root);
        //search a key in BST
        int key =7;
        System.out.println();
        if(search(root,key)){
            System.out.println(key +" is Found in tree");
        }
        else{
            System.out.println("Not present in tree");
        }
        //delete from BST
        delete(root, 4);
        inOrder(root);

    }
}
