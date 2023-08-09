package DSA.Lecture_3LinkedList;

public class RemoveDuplicates {
    public static void main(String... args){
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.display();
        removeDuplicates(list.head);
        list.display();
    }
    public static void removeDuplicates(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node node = head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
    }
}
