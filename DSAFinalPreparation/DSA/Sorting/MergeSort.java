import java.util.Arrays;

public class MergeSort {
    public static void main(String... args){
        int[] arr = {2,3,4,1,5};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int i, int j){
        if(i>=j){
            return;
        }
        int mid = i + (j-i)/2;
        mergeSort(arr, i, mid);
        mergeSort(arr, mid+1, j);
        merge(arr, i, mid, j);
    }
    static void merge(int[] arr, int i, int mid, int j){
        int[] mergeArr = new int[j-i+1];
        int id1 = i;
        int id2 = mid+1;
        int ind = 0;
        while(id1<=mid && id2<=j){
            if(arr[id1]<arr[id2]){
                mergeArr[ind++] = arr[id1++];
            }
            else{
                mergeArr[ind++] = arr[id2++];
            }
        }

        while(id1<=mid){
            mergeArr[ind++] = arr[id1++];
        }
        while(id2<=j){
            mergeArr[ind++] = arr[id2++];
        }

        int low = i;
        for(int s=0; s<mergeArr.length; s++){
            arr[low++] = mergeArr[s];
        }
    }    
}
