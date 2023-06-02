package DSA.Arrays;

public class CheckRotatedSortedArray {
    public static void main(String... args){
      int[] arr = {3,4,5,1,2};
      System.out.println(checkRotatedSorted(arr));
      System.out.println("Done");
    }
    public static boolean checkRotatedSorted(int[] arr){
        int count = 0;
        for(int i=1; i<arr.length; i++){
            //Expecting it to be rotated atleast once 
            //Checking if previous elem is > Current Element
            if(arr[i-1]>arr[i])
                count++;
        }
        //If it is not rotated then it should be sorted where
        //Last element is > 1st element
        if(arr[arr.length-1]>arr[0])
            count++;

        return count<=1;
    }
}
