public class RemoveParenthesis{
    public static void main(String... args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(char c: s.toCharArray()){
            if(c=='('){
                if(count!=0){
                    ans.append(c);
                }
                count++;
            }
            else{
                count--;
                if(count!=0){
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}