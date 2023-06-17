package DSA.Recursion;
import java.util.ArrayList;

public class SubSetONE {
        static ArrayList<String> ans;
    public static void main(String... args){
        ans = new ArrayList<>();
        subSet2("", "abc");
        System.out.println(ans);
        // subSet1("", "abc");
    }
    static void subSet2(String p, String up){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        subSet2(p, up.substring(1));
        subSet2(p+up.charAt(0), up.substring(1));
    }
    static void subSet1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subSet1(p, up.substring(1));
        subSet1(p+up.charAt(0), up.substring(1));
    }
}
