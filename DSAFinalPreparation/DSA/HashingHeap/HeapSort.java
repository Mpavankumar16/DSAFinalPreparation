package DSA.HashingHeap;
import java.util.Arrays;

public class HeapSort {
    
    public static void main(String[] args) {
        int[] arr = {-1,1,3,5,2,9,4};
        buildHeap(arr);
        //After buildign heap using heapify we are certain that top element will have highest
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void buildHeap(int[] arr){
        for(int i = arr.length/2-1; i>0; i--){
            heapify(arr, arr.length, i);
        }
    }
    static void heapSort(int[] arr){
        int i = arr.length-1;
        while(i>1){
            swap(arr, 1, i);
            i--;
            heapify(arr, i, 1);
        }
    }
    static void heapify(int[] arr, int size, int ind){
        int elemInd = ind;
        int left = ind*2;
        int right = ind*2+1;

        if(left<=size && arr[ind]<arr[left]){
            ind = left;
        }
        else if(right<=size && arr[ind]<arr[right]){
            ind = right;
        }

        if(elemInd!=ind){
            swap(arr, ind, elemInd);
            heapify(arr, size, elemInd);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
