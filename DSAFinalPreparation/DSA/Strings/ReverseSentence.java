public class ReverseSentence {
    public static void main(String... args) {
        String s = "  Hello   World";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        int b = s.length();
        int a = b-1;
        StringBuilder ans = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                a--;
            }
            else{
                if(a+1!=b){
                    ans.append(s.substring(a+1, b)).append(" ");
                }
                b = a;
                a--;
            }
        }
        if(a+1!=b){
            ans.append(s.substring(a+1, b));
        }
        else{
            ans.deleteCharAt(ans.length()-1);
        }
        return ans.toString();
    }
}
