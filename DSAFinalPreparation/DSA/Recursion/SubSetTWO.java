package DSA.Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubSetTWO {
    static List<List<Integer>> ans;
    public static void main(String... args){
        ans = new ArrayList<>();
        int[] nums = {1,2,3};
        // subSet1(nums, 0, new ArrayList<>());
        // System.out.println(ans);

        //Template Approach
        subsetsWithDup(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        //Sorting to get all duplicates on one side
        Arrays.sort(nums);
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
        ans.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            // if(i > start && nums[i] == nums[i-1]) 
                // continue; // skip duplicates
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    static void subSet1(int[] nums, int ind, ArrayList<Integer> temp){
        if(ind==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        subSet1(nums, ind+1, temp);
        temp.add(nums[ind]);
        subSet1(nums, ind+1, temp);
        temp.remove(temp.size()-1);
    }

}
