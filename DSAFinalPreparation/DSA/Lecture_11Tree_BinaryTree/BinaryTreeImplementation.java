package DSA.Lecture_11Tree_BinaryTree;

public class BinaryTreeImplementation {
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

    static class Pair{
        int dia;
        int ht;
        Pair(int dia,int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    static class BinaryTree{
        
        int ind = -1;
        public Node buildTree(int[] arr){
            ind++;
            if(ind>=arr.length){
                return null;
            }
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
        
        int countNode(Node root){
            if(root==null){
                return 0;
            }

            return 1 + countNode(root.left) + countNode(root.right);
        }

        int height(Node root){
            if(root==null){
                return 0;
            }

            return 1 + Math.max(height(root.left), height(root.right));
        }

        int diameter(Node root){
            if(root==null){
                return 0;
            }

            /**
             * 3 Conditions
             * left can have dia
             * Right can have dia
             * left and right ht + current node can make max dia
             */
            int left = diameter(root.left);
            int right = diameter(root.right);
            int htDia = height(root.left) + height(root.right) + 1;
            return Math.max(Math.max(left, right), htDia);
        }
        int dia=0;
        int diaEfficient(Node root){
            if(root==null){
                return 0;
            }

            int left = diaEfficient(root.left);
            int right = diaEfficient(root.right);

            //longest dist can be right ht + left ht + 1(curr node)
            dia = Math.max(dia, left+right+1);

            //is used for finding the ht
            return 1 + Math.max(left, right);
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

        System.out.println();

        System.out.println("Node Count: "+bt.countNode(root));
        System.out.println("Heigh of Tree: "+bt.height(root));

        
        System.out.println("Dia of Tree: "+bt.diameter(root));
        System.out.println("Dia of Tree: "+bt.diaEfficient(root));
    }
}
