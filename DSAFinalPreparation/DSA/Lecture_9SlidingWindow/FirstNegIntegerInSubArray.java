package DSA.Lecture_9SlidingWindow;
import java.util.*;

public class FirstNegIntegerInSubArray {
    public static void main(String... args){
        int[] arr = {-8,2,4,5,-3,4,5};
        System.out.println(Arrays.toString(solve(arr, 4)));
    }
    static int[] solve(int[] arr, int k){
        int i=0;
        int j = 0;
        Queue<Integer> temp = new ArrayDeque<>();
        int[] ans = new int[arr.length-k+1];
        int ind = 0;
        while(j<arr.length){
            if(arr[j]<0){
                temp.offer(j);
            }
            if(j-i+1==k){
                ans[ind++] = arr[temp.peek()];
                if(temp.peek()==i){
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
}
