package DSA.Lecture_9SlidingWindow;
import java.util.*;
public class MaxSubArray {
    static long maximumSumSubarray(int k, ArrayList<Integer> arr, int N){
       //Sub Array With Max Sum
        int i = 0;
       int j = 0;
       long currSum = 0;
       long ans = Integer.MIN_VALUE;
       while(j<N){
           currSum +=arr.get(j);
           if(j-i+1<k){
               j++;
           }
           else if(j-i+1==k){
               ans = Math.max(ans, currSum);
               currSum -=arr.get(i);
               i++;
               j++;
           }
       }
       return ans;
    }
}
