package DSA.Lecture_3LinkedList;

public class ReverseLinkedList {
    public static void main(String... args){
        LL linkedList = new LL();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        // linkedList.display();
        
        // Node ans = reverseLinkedList(linkedList.head);
        // Node.display(ans);
        Node ans = reverseBetween(linkedList.head, 2, 4);
        Node.display(ans);
        
    }
    public static Node reverseBetween(Node head, int left, int right) {
        Node dummy = new Node(0); // created dummy node
        dummy.next = head;
        Node prev = dummy; // intialising prev pointer on dummy node
        
        for(int i = 0; i < left - 1; i++)
            prev = prev.next; // adjusting the prev pointer on it's actual index
        
        Node curr = prev.next; // curr pointer will be just after prev
        // reversing
        for(int i = 0; i < right - left; i++){
            Node forw = curr.next; // forw pointer will be after curr
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }
        return dummy.next;
    }
}
