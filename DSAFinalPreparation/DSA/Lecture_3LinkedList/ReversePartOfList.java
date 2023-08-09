package DSA.Lecture_3LinkedList;

public class ReversePartOfList {
    public static void main(String... args){
        LL linkedList = new LL();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(5);
        linkedList.display();
        
        Node ans = reversePartOfList(linkedList.head, 3, 6);
        Node.display(ans);
    }
    public static Node reversePartOfList(Node head, int l, int r){
        if(head==null || head.next==null)
            return head;

        Node ans = new Node();
        Node prev = ans;
        ans.next = head;

        for(int i=0; i<l-1; i++){
            prev = prev.next;
        }

        Node start = prev.next;
        Node then = start.next;

        for(int i=0; i<(r-l); i++){
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return ans.next;
    }
}
