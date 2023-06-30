package DSA.Stack;
import java.util.Stack;

public class ReverseStack {
    public static void main(String... args){
        Stack<Integer> ans = new Stack<>();
        ans.push(1);
        ans.push(2);
        ans.push(3);
        ans.push(4);
        System.out.println(ans);
        reverse(ans);
        System.out.println(ans);
    }
    static void reverse(Stack<Integer> ans){
        if(ans.isEmpty()){
            return;
        }
        int val = ans.pop();
        reverse(ans);
        pushBack(ans, val);
    }
    static void pushBack(Stack<Integer> ans, int pushElement){
        if(ans.isEmpty()){
            ans.push(pushElement);
            return;
        }

        int val = ans.pop();
        pushBack(ans, pushElement);
        ans.push(val);
    }
}
