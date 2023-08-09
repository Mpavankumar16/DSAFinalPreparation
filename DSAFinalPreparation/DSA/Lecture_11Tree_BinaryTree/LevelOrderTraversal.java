package DSA.Lecture_11Tree_BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import DSA.Lecture_11Tree_BinaryTree.BinaryTreeImplementation.Node;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> temp = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        List<Integer> ansTemp;
        temp.offer(root);
        temp.offer(null);
        Node node;
        while(!temp.isEmpty()){
            ansTemp = new ArrayList<>();
            while(temp.peek()!=null){
                node = temp.poll();
                ansTemp.add(node.data);
                if(node.left!=null){
                    temp.offer(node.left);
                }
                if(node.right!=null){
                    temp.offer(node.right);
                }
            }
            ans.add(ansTemp);
            
            node = temp.poll();
            if(!temp.isEmpty()){
                temp.offer(node);
            }
        }
        return ans;
    }
}
