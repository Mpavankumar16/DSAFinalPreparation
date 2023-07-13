package practice;

import java.util.*;

public class Practice{
    public static void main(String... args){
        List<String> l = new ArrayList<>();
        l.add("aaaa");
        l.add("aaa");
        System.out.println(wordBreak("aaaaaaa", l));
       
    }
    public static class Node{
        Node[] children;
        boolean end;
        Node(){
            children = new Node[26];
            end = false;
        }
    }
    public static class Trie{
        Node root;
        Trie(){
            root = new Node();
        }
        void insert(String s){
            Node n = root;
            char c;
            for(int i=0; i <s.length(); i++){
                c = s.charAt(i);
                if(n.children[c-'a']==null){
                    n.children[c-'a'] = new Node();
                }
                n = n.children[c-'a'];
                if(i==s.length()-1){
                    n.end = true;
                }
            }
        }
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Trie t = new Trie();
        for(String str: wordDict){
            t.insert(str);
        }

        Node head = t.root;
        char c;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if(head.end){
                head = t.root;
            }
            if(head.children[c-'a']==null){
                return false;
            }
            if(i==s.length()-1 && !head.children[c-'a'].end){
                return false;
            }
            else{
                head = head.children[c-'a'];
            }
        }
        return true;
    }
}