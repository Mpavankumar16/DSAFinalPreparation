package DSA.Recursion;

public class BinarySearch {
    public static void main(String... args){
        binarySearch(new int[] {1,2,3,4,5,6}, 9, 0, 5);
    }
    static void binarySearch(int[] arr, int key, int s, int e){
        if(s>e){
            System.out.println(-1);
            return;
        }
        int mid =  s +(e-s)/2;
        if(arr[mid]==key){
            System.out.println(mid);
            return;
        }
        else if(key<arr[mid]){
            e = mid-1;
        }
        else{
            s = mid+1;
        }
        binarySearch(arr, key, s, e);
    }
}
