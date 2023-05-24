public class CheckPalindrome{
    public static void main(String... args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public boolean isPalindrome(String s) {
        String ans = "";
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)>='0' && s.charAt(i)<='9')){
                ans +=s.charAt(i);
            }    
        }
        
        int m=0; int n=ans.length()-1;
        while(m<=n){
            if(ans.charAt(m)==ans.charAt(n)){
                m++;
                n--;
            }
            else
                return false;
        }
        return true;
    }
}