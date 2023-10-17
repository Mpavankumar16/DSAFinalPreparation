package DSA.Lecture_10HashingHeap;

import java.util.PriorityQueue;

public class KLargestElem {
    public static void main(String... args){
        System.out.println(findKthLargest(new int[] {5,3,2,4,1}, 2));
    
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i: nums){
            p.add(i);
           // if(p.size()>k)
             //   p.remove();
        }
        return p.peek();
    }
}
