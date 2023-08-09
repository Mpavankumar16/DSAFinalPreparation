package DSA.Lecture_11Tree_BinaryTree;
import java.util.*;

import DSA.Lecture_11Tree_BinaryTree.BinaryTreeImplementation.Node;
public class PreInPostTraversal {
    class Pair{
        Node node;
        int num;
        Pair(Node node, int num){
            this.node = node;
            this.num = num;
        }
    }
    public void solve(Node root){
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();
        Stack<Pair> temp = new Stack<>();
        temp.push(new Pair(root, 1));

        Pair val;
        while(!temp.isEmpty()){
            val = temp.pop();
            if(val.num==1){
                pre.add(val.node.data);
                val.num++;
                temp.push(val);

                if(val.node.left!=null){
                    temp.push(new Pair(val.node.left, 1));
                }
            }

            else if(val.num==2){
                in.add(val.node.data);
                val.num++;
                temp.push(val);

                if(val.node.right!=null){
                    temp.push(new Pair(val.node.right, 1));
                }
            }

            else{
                post.add(val.node.data);
            }
        }
    }
}
