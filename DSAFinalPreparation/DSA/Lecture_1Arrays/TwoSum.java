package DSA.Lecture_1Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String... args){
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                return new int[] {i, map.get(rem)};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
