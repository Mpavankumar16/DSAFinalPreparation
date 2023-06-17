package DSA.Recursion;
import java.util.ArrayList;
public class SubSequenceSubSetTwo {
    public static void main(String... args){
        System.out.println(subSeq(new int[] {1,2,3}, 0));
    }
    static ArrayList<ArrayList<Integer>> subSeq(int [] arr, int i){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(i==arr.length){
            ans.add(new ArrayList<>());
            return ans;
        }
        int val = arr[i];
        ArrayList<ArrayList<Integer>> reAns = subSeq(arr, i+1);

        for(ArrayList<Integer> value: reAns){
            ans.add(new ArrayList<>(value));
            value.add(val);
            ans.add(value);
        }
        return ans;
    }
}
