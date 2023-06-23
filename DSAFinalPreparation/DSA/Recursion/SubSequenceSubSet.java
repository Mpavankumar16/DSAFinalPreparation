package DSA.Recursion;
import java.util.ArrayList;
public class SubSequenceSubSet {
    public static void main(String... args){
        // System.out.println(subSeq("abc"));
        System.out.println(subSeqTwo(new int[] {1,2,3}, new ArrayList<>(), 0));
    }
    static ArrayList<ArrayList<Integer>> subSeqTwo(int[] nums, ArrayList<Integer> temp, int ind){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(ind==nums.length){
            ans.add(new ArrayList<>(temp));
            return ans;
        }
        int val = nums[ind];
        ans.addAll(subSeqTwo(nums, temp, ind+1));
        temp.add(val);
        ans.addAll(subSeqTwo(nums, temp, ind+1));
        temp.remove(temp.size()-1);
        return ans;
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
