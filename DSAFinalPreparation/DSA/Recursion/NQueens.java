package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String... args){
        
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        solve(0, arr, ans, new boolean[n], new boolean[2*n], new boolean[2*n]);
        return ans;
    }
    void solve(int col, char[][] arr, List<List<String>> ans, boolean[] horiz, boolean[] diag1, boolean[] diag2){
        if(col==arr.length){
            List<String> temp = new ArrayList<>();
            StringBuilder ansStr = new StringBuilder();
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr.length; j++){
                    ansStr.append(arr[i][j]);
                }
                temp.add(ansStr.toString());
                ansStr.delete(0, ansStr.length());
            }
            ans.add(temp);
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(!horiz[i] && !diag1[i-col+arr.length] && !diag2[i+col]){
                arr[i][col] = 'Q';
                horiz[i] = true;
                diag1[i-col+arr.length] = true;
                diag2[i+col]  =true;
                solve(col+1, arr, ans, horiz, diag1, diag2);
                arr[i][col] = '.';
                horiz[i] = false;
                diag1[i-col+arr.length] = false;
                diag2[i+col]  =false;
            }
        }
    }

    boolean isPossible(int row, int col, char[][]arr, boolean[] horiz){
        int i = row;
        int j = col;
        if(horiz[i]){
            return false;
        }

        j = col;
        while(j>=0){
            if(arr[row][j]=='Q')
                return false;
            j--;
        }

        i = row;
        j = col;
        while(i<arr.length && j>=0){
            if(arr[i][j]=='Q')
                return false;
            i++;
            j--;
        }

        return true;
    }
}
