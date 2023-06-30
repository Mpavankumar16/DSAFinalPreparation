package DSA.LinkedList;

public class PLUSONE {
     public Node addTwoNumbers(Node l1, Node l2) {
        Node ans = new Node();
        Node temp = ans;
        int value = 0;
        int c = 0;
        while(l1!=null && l2!=null){
            value = l1.value+l2.value+c;
            if(value>9){
                c = 1;
                temp.next = new Node(value%10);
                temp = temp.next;
            }
            else{
                c = 0;
                temp.next = new Node(value);
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null){
            value = l1.value+c;
            if(value>9){
                c = 1;
                temp.next = new Node(value%10);
                temp = temp.next;
            }
            else{
                c = 0;
                temp.next = new Node(value);
                temp = temp.next;
            }
            l1 = l1.next;
        }

        while(l2!=null){
            value = l2.value+c;
            if(value>9){
                c = 1;
                temp.next = new Node(value%10);
                temp = temp.next;
            }
            else{
                c = 0;
                temp.next = new Node(value);
                temp = temp.next;
            }
            l2 = l2.next;
        }
        if(c==1){
            temp.next = new Node(1);
            temp = temp.next;
        }
        return ans.next;
    }
    Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
