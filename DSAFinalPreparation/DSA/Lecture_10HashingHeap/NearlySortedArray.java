package DSA.Lecture_10HashingHeap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class NearlySortedArray {
    public static void main(String... args){
        System.out.println(nearlySorted(new int[] {6,5,3,2,8,10,9}, 3));
    }
    static ArrayList <Integer> nearlySorted(int arr[], int k){
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> temp = new PriorityQueue<>();
       for(int i: arr){
           temp.add(i);
           if(temp.size()>k){
               ans.add(temp.peek());
               temp.remove();
           }
       }
       
       while(temp.size()!=0){
           ans.add(temp.remove());
       }
       return ans;
    }
}
