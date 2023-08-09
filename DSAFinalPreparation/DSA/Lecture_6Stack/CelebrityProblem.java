package DSA.Lecture_6Stack;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String... args){
        /**
         * {{0 1 0},
            {0 0 0}, 
            {0 1 0}}
         */
    }
    int celebrityNotEfficient(int[][] arr, int n){
    	for(int i=0; i<n; i++){
    	    boolean iKnowThem =false;
    	    for(int j=0; j<n; j++){
    	        if(i!=j && arr[i][j]==1){
    	            iKnowThem = true;
    	            break;
    	        }
    	    }
    	    
    	    if(!iKnowThem){
    	        boolean theyKnowMe = true;
    	        for(int j=0; j<n; j++){
    	            if(i!=j && arr[j][i]==0){
    	                theyKnowMe =  false;
    	                break;
    	            }
    	        }
    	        
    	        if(theyKnowMe){
    	            return i;
    	        }
    	    }
    	}
    	return -1;
    }
    int celebrity(int[][] arr, int n){
    	Stack<Integer> temp = new Stack<>();
    	for(int i=0; i<n; i++){
    	    temp.push(i);
    	}
    	
    	int a,b;
    	while(temp.size()!=1){
    	    a = temp.pop();
    	    b = temp.pop();
    	    if(arr[a][b]==1){
    	        temp.push(b);
    	    }
    	    else{
    	        temp.push(a);
    	    }
    	}
    	for(int i=0; i<n; i++){
    	    if(temp.peek()!=i && arr[temp.peek()][i]==1){
    	        return -1;
    	    }
    	    if(temp.peek()!=i && arr[i][temp.peek()]==0){
    	        return -1;
    	    }
    	}
    	
    	return temp.peek();
    	
    }
}
