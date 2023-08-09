package DSA.Lecture_11Tree_BinaryTree;


import DSA.Lecture_11Tree_BinaryTree.BinaryTreeImplementation.BinaryTree;
import DSA.Lecture_11Tree_BinaryTree.BinaryTreeImplementation.Node;

public class SubTreeOfAnotherTree {
    public static void main(String[] args) {
        BinaryTree tr = new BinaryTree();
        Node mainNode = tr.buildTree(new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1});
        Node subTree = tr.buildTree(new int[]{2,4,-1,-1,6});
        
        System.out.println(isSubtree(mainNode, subTree));
    }
    public static  boolean isSubtree(Node root, Node subRoot) {
        return subRootCheck(root, subRoot);
    }
    static boolean subRootCheck(Node root, Node subRoot){
        if(root==null){
            return false;
        }
        if(solve(root, subRoot)){
            return  true;
        }
        return subRootCheck(root.left, subRoot) || subRootCheck(root.right, subRoot);
    }
    static boolean solve(Node root, Node sub){
        if(root==null && sub==null){
            return true;
        }
        if(root==null || sub==null){
            return false;
        }
        if(root.data!=sub.data){
            return false;
        }
        return solve(root.left, sub.left) && solve(root.right, sub.right);
    }
}
