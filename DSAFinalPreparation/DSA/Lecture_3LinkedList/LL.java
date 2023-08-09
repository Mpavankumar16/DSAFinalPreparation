package DSA.Lecture_3LinkedList;

public class LL {
    int size = 0;
    Node head = null;

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void delete(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void delteAt(int ind){
        if(ind==0){
            deleteFirst();
            return;
        }
        if(ind==size){
            delete();
            return;
        }
        Node temp = head;
        while(ind-1!=0){
            ind--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void insertAt(int val, int ind){
        if(ind==0){
            addFirst(val);
            return ;
        }
        if(ind==size+1){
            add(val);
            return;
        }
        Node temp = head;
        while(ind-1!=0){
            temp = temp.next;
            ind--;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public void addFirst(int val){
        Node node = new Node(val);
        if(head==null){
            size++;
            head=  node;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }
    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            size++;
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }
}
