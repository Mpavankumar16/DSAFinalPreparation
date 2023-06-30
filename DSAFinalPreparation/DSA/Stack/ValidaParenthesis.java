package DSA.Stack;

import java.util.Stack;

public class ValidaParenthesis {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        for(char c: s.toCharArray()){
            switch(c){
                case '(':
                    ans.push(')');
                    break;
                case '{':
                    ans.push('}');
                    break;
                case '[':
                    ans.push(']');
                    break;
                default:
                    if(ans.isEmpty() || c!=ans.pop())
                        return false;
            }
        }
        return ans.isEmpty();
    }
}
