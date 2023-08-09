package DSA.Lecture_8Queue;
import java.util.*;
public class QueueLinkedList {
    public static class QueueLL{
        class Node{
            int val;
            Node next;
            Node(int data){
                val = data;
                next = null;
            }
        }
        Node head = null;
        Node tail = null;
        boolean isEmpty(){
            return head==null && tail==null;
        }

        void add(int data){
            Node n = new Node(data);
            if(head==null){
                head = n;
                tail = head;
                return;
            }
            tail.next = n;
            tail = n;
        }

        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty ");
                return -1;
            }
            int val = head.val;
            //Head and tail at same element then make tail as null 
            if(head==tail){
                tail = null;
            }
            head = head.next;
            return val;
        }
    }
    
    public static void main(String... args){
        // QueueLL q = new QueueLL();
        
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.isEmpty());

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
