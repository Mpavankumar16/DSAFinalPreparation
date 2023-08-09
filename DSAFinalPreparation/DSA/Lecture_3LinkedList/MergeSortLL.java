package DSA.Lecture_3LinkedList;

public class MergeSortLL {
    public static void main(String... args){
        LL l = new LL();
        l.add(2);
        l.add(3);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(-8);
        l.add(0);
        l.display();
        Node ans = mergeSort(l.head);
        Node.display(ans);
    }
    static Node mergeSort(Node head){
        if(head==null || head.next==null)
            return head;
        
        Node mid = findMid(head);

        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = mergeSort(left);
        right = mergeSort(right);
        Node res = merge(left, right);

        return res;
    }
    static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node merge(Node left, Node right){
        Node ans = new Node();
        Node temp = ans;

        while(left!=null && right!=null){
            if(left.value<right.value){
                temp.next = left;
                temp  =temp.next;
                left = left.next;
            }
            else{
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }

        if(left!=null){
            temp.next = left;
        }
        else{
            temp.next = right;
        }

        return ans.next;
    }
}
