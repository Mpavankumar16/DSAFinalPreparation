package DSA.Lecture_3LinkedList;

public class Node{
    int value;
    Node next;

    Node(){}
    
    Node(int value){
        this.value = value;
        next = null;
    }

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    static void display(Node head){
        while(head!=null){
            System.out.print(head.value+"->");
            head = head.next;
        }
        System.out.println("END");
    }
}
