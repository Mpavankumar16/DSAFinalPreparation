package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String... args){
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
     public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subSet(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    public static void solve(int[] nums, int ind, List<List<Integer>> ans, ArrayList<Integer> temp){
        ans.add(new ArrayList<>(temp));
        if(ind==nums.length){
            return;
        }

        for(int i=ind; i<nums.length; i++){
            temp.add(nums[i]);
            solve(nums, i+1, ans, temp);
            temp.remove(temp.size()-1);
        }
    }
    public static void subSet(int[] nums, int i, List<Integer> p, List<List<Integer>> ans){
        //n*2^n => as n elements are being copied and every number has 2 options either pick or not pick

        if(i==nums.length){
            ans.add(new ArrayList<>(p));
            return;
        }
        subSet(nums, i+1, p, ans);
        p.add(nums[i]);
        subSet(nums, i+1, p, ans);
        p.remove(p.size()-1);
    }
}
