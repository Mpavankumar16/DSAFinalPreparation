package DSA.Recursion;
import java.util.ArrayList;
public class SubSequenceSubSet {
    public static void main(String... args){
        System.out.println(subSeq("abc"));
    }
    static ArrayList<String> subSeq(String str){
        ArrayList<String> ans = new ArrayList<>();
        if(str.isEmpty()){
            ans.add("");
            return ans;
        }
        char c = str.charAt(0);
        
        //bc => b,bc,c,""
        ArrayList<String> recursionList = subSeq(str.substring(1));

        for(String seq: recursionList){
            ans.add(seq);
            ans.add(c+seq);
        }
        return ans;
    }
}
