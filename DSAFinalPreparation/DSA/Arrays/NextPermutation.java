package DSA.Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String... args){
        int[] arr = {1,3,5,4,2}; //1 4 2 3 5;
        nextPermuatation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermuatation(int[] nums){
        //Taking index as -1 if array is 321 we won't find breakpoint
        int breakpoint = -1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                breakpoint = i;
                break;
            }
        }

        //If array is 321 then just rev it
        if(breakpoint==-1){
            rev(nums, 0, nums.length-1);
        }

        //Swapped lower number with breakpoint
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]>nums[breakpoint]){
                int temp = nums[i];
                nums[i] = nums[breakpoint];
                nums[breakpoint] = temp;
                break;
            }
        }

        rev(nums, breakpoint+1, nums.length-1);
    }
    public static void rev(int[] arr, int s, int e){
        int temp =0;
        while(s<e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
