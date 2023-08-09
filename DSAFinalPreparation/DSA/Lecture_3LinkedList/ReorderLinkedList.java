package DSA.Lecture_3LinkedList;

public class ReorderLinkedList {
    public static void main(String... args){
        LL linkedList = new LL();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        reorderList(linkedList.head);
        Node.display(linkedList.head);
        
    }
    public static void reorderList(Node head) {
        if(head==null || head.next==null)
            return;
            
        Node middle = middleNodeFinder(head);
        Node hs = reverse(middle.next);
        middle.next = null;

        Node hf = head;
        Node temp = new Node();
        while(hs!=null && hf!=null){
            temp = hs.next;
            hs.next = hf.next;
            hf.next = hs;
            hf = hs.next;
            hs = temp;
        }
    }
    public static Node reverse(Node head){
        if(head==null || head.next==null)
            return head;
        Node prev = null;
        Node pres = head;
        Node next = head.next;

        while(pres!=null){
            pres.next = prev;
            prev =pres;
            pres = next;
            if(next!=null)
                next = next.next;
        }
        return prev;
    }
    public static Node middleNodeFinder(Node head){
        Node s = head;
        Node f = head.next;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
