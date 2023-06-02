package DSA.Arrays;
import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 3, 2, 1};
        System.out.println(longestConsecutiveSequence(arr));
    }
    public static int longestConsecutiveSequence(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        int count = 0;
        int ans = 0;
        int num = 0;
        for(int i: arr){
            count = 1;

            num = i;
            while(set.contains(--num)){
                count++;
                set.remove(num);
            }

            num = i;
            while(set.contains(++num)){
                count++;
                set.remove(num);
            }

            ans = Math.max(count, ans);
        }
        return ans;
    }
}
