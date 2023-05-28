import java.util.Arrays;

public class QuickSort {
    public static void main(String... args){
        int[] arr = {3,2,4,1,1,4,3,5};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int i, int j){
        if(i<j){
            int pivot = pivot(arr, i, j);
            quickSort(arr, i, pivot-1);
            quickSort(arr, pivot+1, j);
        }
    }

    static int  pivot(int[] arr, int low, int high){
        int ind = low-1;
        int pivot = arr[high];
        
        for(int i = low; i<high; i++){
            if(arr[i]<pivot){
                ind++;
                swap(arr, i, ind);
            }
        }
        ind++;
        swap(arr, ind, high);
        return ind;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
