package DSA.Stack;

import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String... args){
        
    }
    public int largestRectangleArea(int[] arr) {
        Stack<int[]> st = new Stack<>();
        int[] arr1 = new int[arr.length];
        rightSmall(arr1, st, arr);
        
        st.clear();
        int max = 0;
        int val = 0;
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i]<=st.peek()[0]){
                st.pop();
            }

            if(st.isEmpty()){
                val = i + arr1[i];
                max = Math.max(max, val * arr[i]);
            }
            else{
                val = i-st.peek()[1] + arr1[i]-1;
                max = Math.max(max, val * arr[i]);
            }
            st.push(new int[] {arr[i], i});
        }
        return max;
    }
    void rightSmall(int[] arr1, Stack<int[]> right, int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            while(!right.isEmpty() && arr[i]<=right.peek()[0]){
                right.pop();
            }

            if(right.isEmpty()){
                arr1[i] = arr.length-i;
            }
            else{
                arr1[i] = right.peek()[1]-i;
            }
            right.push(new int[] {arr[i], i});
        }
    }
}
