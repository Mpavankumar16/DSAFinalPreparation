package DSA.Recursion;

public class DuplicateSubSequence {
    public static void main(String... args){
        solve("abc", "", 0);
    }
    static void solve(String p, String up, int ind){
        System.out.println(up);
        if(ind==p.length()){
            return;
        }

        for(int i=ind; i<p.length(); i++){
            if(i>ind && p.charAt(i)==p.charAt(ind))
                continue;
            solve(p, up+p.charAt(i), ind+1);
        }
    }
}
