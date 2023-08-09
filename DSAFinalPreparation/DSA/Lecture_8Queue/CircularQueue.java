package DSA.Lecture_8Queue;

public class CircularQueue {
    static int size = 0;
    int[] arr;
    int front=-1;
    int rear = -1;

    CircularQueue(int size){
        arr = new int[size];
        this.size = size;
    }

    boolean isEmpty(){
        return rear==-1 && front==-1;
    }

    boolean isFull(){
        return (rear+1)%size == front;
    }

    void push(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            rear++;
            front++;
            arr[rear] = val;
            return;
        }
        rear = (rear+1)%size;
        arr[rear] = val;
        return;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        if(rear==front){
            int val = arr[front];
            front = -1;
            rear = -1;
            return val;
        }
        int val = arr[front];
        front = (front+1)%size;
        return val;
    }
    
    int peak(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = arr[front];
        return val;
    }
    public static void main(String... args) {
        CircularQueue q = new CircularQueue(3);
        q.peak();
        q.pop();
        q.push(1);
        q.push(2);
        q.push(3);
        q.pop();
        q.push(4);

        while(!q.isEmpty()){
            System.out.println(q.pop());
        }
    }
}
