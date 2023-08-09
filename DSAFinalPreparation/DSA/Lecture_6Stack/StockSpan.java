package DSA.Lecture_6Stack;
import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    
    Stack<int[]> st= new Stack();
    class StockSpanner {
        public int next(int price) {
            int span=  1;
            
            while(!st.isEmpty() && price>=st.peek()[0]){
                span += st.pop()[1];
            }

            st.push(new int[]{price, span});
            return span;
        }
    }
}
