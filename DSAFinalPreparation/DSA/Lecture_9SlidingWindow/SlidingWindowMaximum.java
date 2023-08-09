package DSA.Lecture_9SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String... args){
        System.out.println(Arrays.toString(maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3)));
    }
    public int[] maxSlidingWindowEfficient(int[] a, int k) {
        int[] ans = new int[a.length-k+1];
        int i=0; int j=0;
        int ind = 0;
        Deque<Integer> temp = new ArrayDeque<>();
        while(j<a.length){
            while(!temp.isEmpty() && a[j]>temp.getLast()){
                temp.removeLast();
            }
            temp.offer(a[j]);
            if(j-i+1==k){
                ans[ind++] = temp.peek();
                if(temp.peek()==a[i]){
                    temp.poll();
                }
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        st.push(nums.length-1);
        nge[nums.length-1] = nums.length;

        for(int i=nums.length-2; i>=0; i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = nums.length;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(i);
        }
        
        int[] ans = new int[nums.length-k+1];
        
        int j = 0;
        for(int i=0; i<ans.length; i++){
            if(j<i)
                j = i;

            //Checking for next greater till the current next greater is out side the range
            while(nge[j]<i+k){
               j = nge[j];
            }
            //Current nge is outside range but the current element is inside the range
            //Current elem is nge of prev element
            //So for this window that is our nge
            ans[i] = nums[j];
        }
        return ans; 
    }
}
