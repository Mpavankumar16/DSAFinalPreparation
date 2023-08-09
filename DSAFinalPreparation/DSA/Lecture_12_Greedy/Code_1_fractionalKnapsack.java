package DSA.Lecture_12_Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Code_1_fractionalKnapsack {
    class Item{
        int value;
        int weight;
        Item(int val, int wt){
            value = val;
            weight = wt;
        }
    }
    //Used for comparing values and sort arr
    class ItemComparator implements Comparator<Item>{
        @Override
        public int compare(Item a, Item b){
            double x = (double) a.value/a.weight;
            double y = (double) b.value/b.weight;
            
            if(x<y){
                return 1;
            }
            else if(x>y){
                return -1;
            }
            return 0;
        }
    }
    
    double fractionalKnapsack(int W, Item arr[], int n) {
        //sorting to get max wt with less value
        Arrays.sort(arr, new ItemComparator());
        
        int wt=0;
        double value = 0;
        
        for(int i=0; i<n; i++){
            //if crnt wt is < total wt I take then I can consider its val
            if(wt+arr[i].weight<=W){
                wt +=arr[i].weight;
                value +=arr[i].value;
            }
            else{
                //crnt wt is > total wt 
                //I can only take a chunk and it costs me
                double val = (double)arr[i].value/arr[i].weight;
                value +=val* (W-wt);
                break;
            }
        }
        return value;
    }
}
