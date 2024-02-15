package com.company;

import java.util.*;

public class BinaryTree_Implementation {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int[] nodes){
            index++;
            if(nodes[index]==-1) return null;
            Node newNode =new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        //preorder traversal
        public static void preOrder(Node root){
            if(root==null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        //Inorder Traversal
        public static void inOrder(Node root){
            if(root==null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        //postOrder Traversal
        public static void postOrder(Node root){
            if(root==null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        //Level Order Traversal
        public static void levelOrder(Node root){
            if(root==null) return;
            Queue<Node> q =new LinkedList<>();
            q.add(root);
            q.add(null);// we store null here for nextLine
            while(!q.isEmpty()){
                Node currNode =q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.add(null);
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null) q.add(currNode.left);
                    if(currNode.right!=null) q.add(currNode.right);
                }
            }
        }
        //count of nodes
        public static int countNodes(Node root){
            if(root==null) return 0;
            int leftNodes =countNodes(root.left);
            int rightNodes =countNodes(root.right);
            return(leftNodes+rightNodes+1);
        }
        //sum of Nodes
        public static int sumOfNodes(Node root){
            if(root==null) return 0;
            int leftSum= sumOfNodes(root.left);
            int rightSum=sumOfNodes(root.right);
            return(leftSum+rightSum+root.data);
        }
        //Height of tree
        static public int height(Node root){
            if(root==null) return 0;
            int left =height(root.left);
            int right =height(root.right);
            int myHeight =Math.max(left,right)+1;
            return myHeight;
        }
        public static int diameterOfBinaryTreeWithON2(Node root){
            if(root ==null){
                return 0;
            }
            // in this we calculate 3 diameter for left subtree, right subtree and for root we calculate height
            // so here we run loop n times for height and n times for diameter so TC = O(n2)
            int diam1 = diameterOfBinaryTreeWithON2(root.left);
            int diam2 = diameterOfBinaryTreeWithON2(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;
            return Math.max(diam1,Math.max(diam2,diam3));
        }

        static class TreeInfo{
            int ht ;
            int diam;
            public TreeInfo(int ht, int diam){
                this.ht =ht;
                this.diam =diam;
            }
        }
        public static TreeInfo diameterOfBinaryTreeWithOn(Node root){
            //in this we will calculate both  height and diameter together
            if(root ==null) return new TreeInfo(0,0);
            TreeInfo leftSubtreeInfo = diameterOfBinaryTreeWithOn(root.left);
            TreeInfo rightSubtreeInfo = diameterOfBinaryTreeWithOn(root.right);
            int myHeight = Math.max(leftSubtreeInfo.ht,rightSubtreeInfo.ht) + 1 ;
            int diam1 = leftSubtreeInfo.diam;
            int diam2 = rightSubtreeInfo.diam;
            int diam3 = leftSubtreeInfo.ht + rightSubtreeInfo.diam + 1;
            int myDiam = Math.max(diam1, Math.max(diam2,diam3));
            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
            return myInfo;
        }



    }
    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);
        System.out.println("Preorder Traversal");
        BinaryTree.preOrder(root);//PreOrder traversal -> root,left,right
        System.out.println();
        System.out.println("Inorder Traversal");
        BinaryTree.inOrder(root);//InOrder traversal -> left,root,right
        System.out.println();
        System.out.println("PostOrder Traversal");
        BinaryTree.postOrder(root);//PostOrder traversal -> left,right,root
        System.out.println();
        System.out.println("LevelOrder Traversal");
        BinaryTree.levelOrder(root);//LevelOrder traversal
        System.out.println("Count of Nodes");
        System.out.println(BinaryTree.countNodes(root));;//Count of nodes
        System.out.println("Sum of Nodes");
        System.out.println(BinaryTree.sumOfNodes(root));;//Sum of nodes
        System.out.println("Height of tree");
        System.out.println(BinaryTree.height(root));;//Height of tree
        System.out.println("Diameter of tree with O(n2) TC: ");
        System.out.println(BinaryTree.diameterOfBinaryTreeWithON2(root));
        System.out.println("Diameter of tree with O(n) TC: ");
        System.out.println(BinaryTree.diameterOfBinaryTreeWithOn(root).diam);
    }
}
