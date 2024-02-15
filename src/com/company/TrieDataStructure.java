package com.company;

public class TrieDataStructure {
    static class Node {
        Node[] children ;
        boolean endOfWord;
        public Node(){
            children = new Node[26]; //a to z
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    static Node root = new Node();// root node
    public static void insert(String word){//O(n)
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                //add new node
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1){
                // we will set endOfWord to true
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }
    public static boolean search(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            Node node = curr.children[idx];
            if(node == null){
                return false;
            }
            if(i==word.length()-1 && !node.endOfWord){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.isEmpty()){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        String[] words = {"the","a","there","their","any"};
//        for (String word : words) {
//            insert(word);
//        }
//        System.out.println(search("there"));
//        System.out.println(search("thor"));
//        System.out.println(search("an"));
        //Word Break Problem
        String[] words2 = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";
        for (String word : words2) {
            insert(word);
        }
        System.out.println(wordBreak(key));
     }
}
