package DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetTwo {
    public static void main(String... args) {
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, ans, new ArrayList<>());
        System.gc();
        return ans;
    }
    void solve(int[] nums, int ind, List<List<Integer>> ans, ArrayList<Integer> temp){
        ans.add(new ArrayList<>(temp));
        if(ind==nums.length){
            return;
        }

        for(int i=ind; i<nums.length; i++){
            if(i>ind && nums[i]==nums[i-1])
                continue;
            
            temp.add(nums[i]);
            solve(nums, i+1, ans, temp);
            temp.remove(temp.size()-1);
        }
    }
}
