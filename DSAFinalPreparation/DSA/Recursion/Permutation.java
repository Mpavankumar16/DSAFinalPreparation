package DSA.Recursion;
import java.util.*;
public class Permutation {
    public static void main(String... args){
        // permutation("", "abc");
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // permutationOne(new int[]{1,2,3}, new ArrayList<>(), ans, new boolean[3]);
        permutationEfficient(new int[]{1,2,3}, 0, ans);
        System.out.println(ans);
    }
    static void permutationEfficient(int[] nums, int ind, ArrayList<ArrayList<Integer>> ans){
        if(ind==nums.length-1){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i: nums){
                temp.add(i);
            }
            ans.add(temp);
            return;
        }

        for(int i=ind; i<nums.length; i++){
            swap(i, ind, nums);
            permutationEfficient(nums, ind+1, ans);
            swap(i, ind, nums);
        }
        
    }
    static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void permutationOne(int[] nums, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans, boolean[] taken){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!taken[i]){
                taken[i] = true;
                temp.add(nums[i]);
                permutationOne(nums, temp, ans, taken);
                taken[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first+c+second, up.substring(1));
        }
    }
}
