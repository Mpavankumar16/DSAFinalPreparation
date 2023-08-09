package DSA.Lecture_12_Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Code_3_Nmeetings {
    static class Pair implements Comparator<Pair>{
        int val;
        int ind;
        Pair(){}
        Pair(int value, int index){
            this.val = value;
            this.ind = index;
        }
        @Override 
        public int compare(Pair a, Pair b){
            if(a.val>b.val)
                return 1;
            else if(a.val<b.val)
                return -1;
            return 0;
        }
        
    }
    public static int maxMeetings(int start[], int end[], int n){
       //Creating a pair to store end sorted result with index
        Pair[] pair = new Pair[n];
       for(int i=0; i<n; i++){
           pair[i] = new Pair(end[i], i+1);
       }
       Arrays.sort(pair, new Pair());
       
       int ans = 1;
       int prevClose = pair[0].val;
       for(int i=1; i<n; i++){
           if(start[pair[i].ind-1]>prevClose){
               ans++;
               prevClose = pair[i].val;
           }
       }
    
        return ans;    
    }
}
