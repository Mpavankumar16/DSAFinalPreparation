package DSA.Arrays;
import java.util.*;
public class CheckSubArraySumK {
    public static void main(String... args){
        System.out.println(lenOfLongSubarr(new int[]{
            -13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6
        }, 17, 15));
    }
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            //adding values to sum to check if k exists
            sum +=arr[i];

            //checking if k exista and adding +1 as it's 0 based indexing
            if(sum==k){
                ans = Math.max(ans, i+1);
            }

            //getting the required subarray
            if(map.containsKey(sum-k)){
                System.out.println(i+" "+map.get(sum-k));
                ans = Math.max(ans, i-map.get(sum-k));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return ans;
    }
}
