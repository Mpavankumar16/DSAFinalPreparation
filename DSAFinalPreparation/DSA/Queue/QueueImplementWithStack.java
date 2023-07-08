package DSA.Queue;
import java.util.*;

public class QueueImplementWithStack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }
    
    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        if(!output.isEmpty())
            return false;
        if(!input.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String... args) {
        Queue<Integer> ans = new LinkedList<>();
        
    }
}
