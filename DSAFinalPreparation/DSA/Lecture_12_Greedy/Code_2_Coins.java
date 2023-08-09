package DSA.Lecture_12_Greedy;

public class Code_2_Coins {
    public static void main(String[] args) {
        System.out.println(minCoins(new int[]{9,6,5,1}, 11));
    }
    static int ans = Integer.MAX_VALUE;
	public static int minCoins(int coins[], int M) {
	    solve(coins, 0, M, 0, 0);
	    if(ans==Integer.MAX_VALUE){
	        return -1;
	    }
	    return ans;
	} 
	static void solve(int[] arr, int ind, int sum, int currSum, int count){
	    if(currSum==sum){
	        ans = Math.min(ans, count);
	        return;
	    }
	    
	    if(currSum>sum){
	        return;
	    }
	    
	    for(int i=ind; i<arr.length; i++){
	        currSum +=arr[ind];
	        System.out.println(currSum);
	        solve(arr, i, sum, currSum, count+1);
	        currSum -=arr[ind];
	    }
	}
}
