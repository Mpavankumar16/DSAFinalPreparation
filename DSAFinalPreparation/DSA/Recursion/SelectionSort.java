package DSA.Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String... args){
        int[] arr = {1,4,3,2,5,25,6,8};
        selectionSort(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int i, int j){
        if(i==arr.length-1){
            return;
        }
        if(j!=0){
            if(arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            selectionSort(arr, i, j-1);
        }
        else{
            selectionSort(arr, i+1, i+2);
        }
    }
}
