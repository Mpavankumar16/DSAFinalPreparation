package DSA.Lecture_3LinkedList;

public class LindedListDemo {
    public static void main(String... args) {
        LL linkedList = new LL();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.addFirst(0);
        System.out.println(linkedList.size);
        linkedList.insertAt(3, 3);
        System.out.println(linkedList.size);
        linkedList.insertAt(-1 , 0);
       linkedList.insertAt(6 , 8);
       linkedList.display();

       System.out.println();
       linkedList.deleteFirst();
       linkedList.display();
       linkedList.delete();;
       linkedList.display();
       linkedList.delteAt(linkedList.size);
       linkedList.display();
       System.out.println(linkedList.size);
    }
}
