package DSA.Lecture_3LinkedList;

public class RotateKTimes {
    public static void main(String... args){
        LL linkedList = new LL();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        
        Node temp = rotateRight(linkedList.head, 2);
        Node.display(temp);
    }
    public static Node rotateRight(Node head, int k) {
        Node prev = null;
        Node pres = head;
        Node next = pres.next;
        int count = 1;
        while(pres!=null){
            count++;
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null)
                next = next.next;
        }

        head = prev;
      
        Node temp = head;
        k = k%count;
        System.out.println(k);
        for(int i=0; i<k; i++){
            temp = temp.next;
        }

        prev = head;
        pres = prev.next;
        next = pres.next;
        while(pres!=temp){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null)
                next = next.next;
        }
        head.next = null;

       
        pres = temp;
        temp = null;
        next = pres.next;
        while(pres!=null){
            pres.next = temp;
            temp = pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }
        }
     
        head.next = temp;
        return prev;
    }
}
