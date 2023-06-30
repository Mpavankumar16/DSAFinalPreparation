package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithQueue {
    class MyStack {
        Queue<Integer> q1 = new ArrayDeque<>();

        public MyStack() {
            
        }
        
        public void push(int x) {
            q1.add(x);
            for(int i=1; i<q1.size(); i++){
                q1.add(q1.remove());
            }

        }
        
        public int pop() {
            if(empty()){
                return -1;
            }
            return q1.poll();
        }
        
        public int top() {
            if(empty()){
                return -1;
            }
            return q1.peek(); 
        }
        
        public boolean empty() {
            return q1.isEmpty();
        }
    }
}
