package practice;

import java.util.*;

public class Practice{
    public static void main(String... args){
        String s = "{{}}}";
        HashMap<Integer, Integer> temp  = new HashMap<>();

    }

    public int numberOfSubarrays(int[] A, int k) {
        return atMost(A, k) - atMost(A, k - 1);
    }

    public int atMost(int[] A, int k) {
        int res = 0;
        int i = 0;
        int n = A.length;
        for (int j = 0; j < n; j++) {
            k -= A[j] % 2;
            while (k < 0)
                k += A[i++] % 2;
            res += j - i + 1;
        }
        return res;
    }
}