package DSA.Lecture_6Stack;
import java.util.*;
public class MinStack {
    Stack<Integer> st = new Stack<>();
    int min;
    
    void push(int val){
        if(st.isEmpty()){
            st.push(val);
            min = val;
        }
        else{
            if(val<min){
                st.push(2*val - min);
                min = val;
            }
            else{
                st.push(val);
            }
        }
    }

    int pop(){
        if(st.isEmpty()){
            return -1;
        }

        int val = st.pop();
        if(val<min){
            int temp = min;
            min = 2 * min - val;
            return temp;
        }
        return val;
    }

    int getMin(){
        return min;
    }
    public static void main(String... args){
        MinStack s = new MinStack();
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println(s.getMin());
        System.out.println(s.pop());
        System.out.println(s.getMin());
        System.out.println(s.pop());
    }

}
