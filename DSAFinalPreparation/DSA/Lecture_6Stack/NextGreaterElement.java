package DSA.Lecture_6Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String... args) {
        long[] arr = {1,3,2,4};
        System.out.println(Arrays.toString(nextLargerElement(arr, arr.length)));
    }
    public static long[] nextLargerElement(long[] arr, int n){ 
        Stack<Long> temp = new Stack<>();
        long[] ans = new long[n];
        ans[n-1] = -1;
        temp.push(arr[n-1]);
        
        long val;
        for(int i=n-2; i>=0; i--){
            val = arr[i];
            while(!temp.isEmpty() && val>=temp.peek()){
                temp.pop();   
            }
            if(temp.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = temp.peek();
            }
            temp.push(arr[i]);
        }
        // reverseArray(ans);
        return ans;
    } 
}
