package DSA.Tree_BinaryTree;

public class PreOrderSeqTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    static class BinaryTree{
        
        int ind = -1;
        Node buildTree(int[] arr){
            ind++;
            if(arr[ind]==-1){
                return null;
            }
            Node rootNode = new Node(arr[ind]);
            rootNode.left = buildTree(arr);
            rootNode.right = buildTree(arr);
            return rootNode;
        }

        void preOrderTraversal(Node root){
            if(root==null){
                System.out.print("-1"+" ");
                return ;
            }
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        void inOrderTraversal(Node root){
            if(root==null){
                return ;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }

        void postOrderTraversal(Node root){
            if(root==null){
                return ;
            }
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(arr);
        System.out.println(root.data);

        bt.preOrderTraversal(root);
        System.out.println();
        bt.inOrderTraversal(root);
        System.out.println();
        bt.postOrderTraversal(root);
    }
}
