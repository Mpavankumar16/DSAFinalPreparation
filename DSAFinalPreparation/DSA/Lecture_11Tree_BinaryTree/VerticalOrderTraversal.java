package DSA.Lecture_11Tree_BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

import DSA.Lecture_11Tree_BinaryTree.BinaryTreeImplementation.Node;

public class VerticalOrderTraversal {
    class Tuple{
        Node node;
        int row;
        int col;
        Tuple(Node node, int row, int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(Node root) {
        Queue<Tuple> q = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> temp = new TreeMap<>();
        q.offer(new Tuple(root, 0,0));

        Node node;
        int x;
        int y;
        while(!q.isEmpty()){
            node = q.peek().node;
            x = q.peek().row;
            y = q.poll().col;

            if(!temp.containsKey(x)){
                temp.put(x, new TreeMap<>());
            }
            if(!temp.get(x).containsKey(y)){
                temp.get(x).put(y, new PriorityQueue<>());
            }
            temp.get(x).get(y).offer(node.data);
            if(node.left!=null){
                q.offer(new Tuple(node.left, x-1, y+1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right, x+1, y+1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ansTemp;
        for(int xVal: temp.keySet()){
            ansTemp = new ArrayList<>();
            for(int yVal: temp.get(xVal).keySet()){
                while(!temp.get(xVal).get(yVal).isEmpty()){
                    ansTemp.add(temp.get(xVal).get(yVal).poll());
                }
            }
            ans.add(ansTemp);
        }
        return ans;
    }
}
