package DSA.Lecture_11Tree_BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

import DSA.Lecture_11Tree_BinaryTree.BinaryTreeImplementation.Node;

public class TopViewBinaryTree {
    static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0));
        
        TreeMap<Integer, Integer> ansMap = new TreeMap<>();
        
        Node node;
        int row;
        while(!q.isEmpty()){
            node = q.peek().node;
            row = q.poll().row;
            
            if(!ansMap.containsKey(row)){
                ansMap.put(row, node.data);
            }
            
            if(node.left!=null){
                q.offer(new Tuple(node.left, row-1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right, row+1));
            }
        }
        
        for(int i: ansMap.keySet()){
            ans.add(ansMap.get(i));
        }
        return ans;
        
    }
    static class Tuple{
        Node node;
        int row;
        Tuple(Node node, int row){
            this.node = node;
            this.row = row;
        }
    }
}
