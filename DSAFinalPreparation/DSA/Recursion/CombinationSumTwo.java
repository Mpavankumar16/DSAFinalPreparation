package DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {
    public static void main(String... args){

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums, int ind, int target, List<List<Integer>> ans, List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind; i<nums.length; i++){
            if(nums[i]>target){
                break;
            }
            //If next and prev are same then we might be making same combinations
            //11122 => 122,  with second one 122, with third one 122
            if(i>ind && nums[i]==nums[i-1]){
                continue;
            }    
            temp.add(nums[i]);
            solve(nums, i+1, target-nums[i], ans, temp);
            temp.remove(temp.size()-1);
        }
    }
}
