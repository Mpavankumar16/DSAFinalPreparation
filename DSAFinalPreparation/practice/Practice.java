package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice{
    public static void main(String... args){
        int[] arr = {1,2,3,3};
        System.out.println(Arrays.toString(max(arr, 0,3, 0)));
    }
    static int[] max(int[] nums, int ind, int num, int count){
        if(ind==nums.length){
            return new int[count];
        }
        if(nums[ind]==num)
            count = count+1;

       int[] ans = max(nums, ind+1, num, count);
       if(nums[ind]==num){
            count--;
            ans[count] = ind;
            count--;
       }
        return ans;
    }
}