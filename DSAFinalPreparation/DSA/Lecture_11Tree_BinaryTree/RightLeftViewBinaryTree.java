package DSA.Lecture_11Tree_BinaryTree;

import java.util.ArrayList;
import java.util.List;

import DSA.Lecture_11Tree_BinaryTree.BinaryTreeImplementation.Node;

public class RightLeftViewBinaryTree {
    ArrayList<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(Node root) {
        solve(root, 0);
        return ans;
    }
    void solve(Node root, int lvl){
        if(root==null){
            return;
        }
        if(lvl==ans.size()){
            ans.add(root.data);
        }
        solve(root.right, lvl+1);
        solve(root.left, lvl+1);
    }
}
