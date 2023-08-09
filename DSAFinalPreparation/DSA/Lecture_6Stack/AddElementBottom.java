package DSA.Lecture_6Stack;
import java.util.Stack;
public class AddElementBottom {
    public static void main(String... args){
        Stack<Integer> ans = new Stack<>();
        ans.add(2);
        ans.add(3);
        ans.add(4);

        System.out.println(ans);
        solve(ans, 1);
        System.out.println(ans);
    }
    static void solve(Stack<Integer> ans, int i){
        if(ans.size()==0){
            ans.push(i);
            return;
        }

        int val = ans.pop();
        solve(ans, i);
        ans.push(val);
    }

}
