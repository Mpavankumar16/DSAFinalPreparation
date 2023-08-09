package DSA.Lecture_6Stack;

import java.util.Arrays;

public class RainWaterTrapping {
    public static void main(String... args){
        int[] arr = new int[] {4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length-1;
        int maxLeft = 0;
        int maxRight = 0;

        while(l<=r){
            //If my current position height is lesser than right
            //Obviously I can fill in water till my right highest point
            if(height[l]<=height[r]){
                //My left is surely lesser than right
                //But is it lesser than max left? if not this is my maxLeft
                if(height[l]>=maxLeft){
                    maxLeft = height[l];
                }
                //If it is lesser than my max left 
                //Then I can fill in this portion with water till my maxLeft
                //   MaxLeft= 4  current = 2   right=6
                /**
                        0   0   1
                        0   0   1
                        1   0   1
                        1   0   1
                        1   1   1
                        1   1   1
                 */
                else{
                    res += maxLeft - height[l];
                }
                l++;
            }
            else{
                if(height[r]>=maxRight){
                    maxRight = height[r];
                }
                else{
                    res += maxRight-height[r];
                }
                r--;
            }
        }
        return res;
    }
    public int trap2(int[] arr) {
        int[] left = new int[arr.length];
        left[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            left[i]= Math.max(left[i-1], arr[i]);
        }
        
        int[] right = new int[arr.length];
        right[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            right[i]= Math.max(right[i+1], arr[i]);
        }
        
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans += Math.min(left[i], right[i])-arr[i];
        }
        return ans;
    }
}
