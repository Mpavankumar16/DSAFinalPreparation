package DSA.Queue;

public class QueueArrayImplementation {
    static int rear = -1;
    static int size = 0;
    static int[] arr;

    QueueArrayImplementation(int size){
        arr = new int[size];
        this.size = size;
    }

    static boolean isEmpty(){
        return rear==-1;
    }

    //Enqueue
    static void add(int i){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = i;
    }

    //Dequeue - O(n)=> time as we always get 0th index val 
    static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int firstVal = arr[0];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return firstVal;
    }

    //Peak
    static int preak(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }
     public static void main(String... args){
        QueueArrayImplementation q =  new QueueArrayImplementation(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
