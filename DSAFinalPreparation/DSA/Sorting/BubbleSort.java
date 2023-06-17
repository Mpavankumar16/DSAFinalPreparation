import java.util.Arrays;

public class BubbleSort {
    public static void main(String... args){
        int[] arr = {3,4,5,1,2};
        boolean swapped = false;
        for(int i=0; i<arr.length-1; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
