package DSA.Stack;

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
        ans[0] = -1;
        temp.push(arr[n-1]);
        
        int ind = 1;
        long val;
        for(int i=n-2; i>=0; i--){
            val = arr[i];
            while(!temp.isEmpty() && val>=temp.peek()){
                temp.pop();   
            }
            if(temp.isEmpty()){
                ans[ind++] = -1;
            }
            else{
                ans[ind++] = temp.peek();
            }
            temp.push(arr[i]);
        }
        reverseArray(ans);
        return ans;
    } 
    static void reverseArray(long[] arr){
        int s = 0;
        int e = arr.length-1;
        long temp;
        while(s<e){
            temp = arr[s];
            arr[s]  =arr[e];
            arr[e]  =temp;
            s++;
            e--;
        }
    }
}
