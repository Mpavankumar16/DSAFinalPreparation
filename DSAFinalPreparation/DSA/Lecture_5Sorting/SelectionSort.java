package DSA.Lecture_5Sorting;

import java.util.Arrays;
public class SelectionSort{
    public static void main(String... args){
        int[] arr = {4,5,3,1,2};
        int min = 0;
        //Pick one element and sort it 
        for(int i=0; i<arr.length; i++){
            min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr, i , min);
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}