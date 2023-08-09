package DSA.Lecture_3LinkedList;

public class ReverseLinkedList_0 {
    public static void main(String... args) {
        
    }
    public static Node reverseList(Node head) {
        if(head==null || head.next==null)
            return head;
        
        
        Node prev = null;
        Node pres = head;
        Node next = pres.next;
        
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null)
                next = pres.next;
        }
        
        return prev;
    }
}
