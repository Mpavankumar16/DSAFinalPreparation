package DSA.Lecture_4Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumOne {
    public static void main(String... args){

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums, int ind, int target, List<List<Integer>> ans, List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(ind==nums.length){
            return;
        }

        if(nums[ind]<=target){
            temp.add(nums[ind]);
            //herw we are considering  the same element
            solve(nums, ind, target-nums[ind], ans, temp);
            temp.remove(temp.size()-1);
        }
        solve(nums, ind+1, target, ans, temp);
    }
}
