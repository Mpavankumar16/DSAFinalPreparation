package DSA.LinkedList;

public class CheckCycleLinkedList {
    public static void main(String... args) {
        
    }
    public static boolean checkCycle(Node n){
        Node fast = n.next.next;
        Node slow = n.next;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
