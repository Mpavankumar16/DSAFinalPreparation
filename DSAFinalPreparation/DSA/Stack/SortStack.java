package DSA.Stack;

import java.util.Stack;

public class SortStack {
    public static void main(String... args){
        Stack<Integer> st =  new Stack<>();
        st.push(2);
        st.push(3);
        st.push(0);
        st.push(1);
        st.push(4);
        solve(st);
        System.out.println(st);
    }
    static void solve(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int val = st.pop();
        solve(st);
        insertSorted(st, val);
    }
    static void insertSorted(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }

        if(val>st.peek()){
            st.push(val);
            return;
        }

        int va = st.pop();
        insertSorted(st, val);
        st.push(va);
    }
}
