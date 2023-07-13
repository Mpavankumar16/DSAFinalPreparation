package DSA.HashingHeap;

import java.util.Arrays;

public class HeapifyAlgo {
    
    public static void main(String[] args) {
        int[] arr = {-1,55,53,54,52,56};
        
        for(int i=arr.length/2-1; i>0; i--){
            heapify(arr, i);
        }

        System.out.println(Arrays.toString(arr));
    }
    static void heapify(int[] arr, int i){
        int largest = i;
        int left = 2*i;
        int right = 2*i+1;

        if(left<arr.length && arr[largest]<arr[left]){
            largest = left;
        }
        else if(right<arr.length && arr[largest]<arr[right]){
            largest = right;
        }

        if(largest!=i){
            swap(arr, largest, i);
            heapify(arr, largest);
        }
    }
    static void swap(int[] arr, int i, int j){
        int tmep = arr[i];
        arr[i] = arr[j];
        arr[j] = tmep;
    }
}
