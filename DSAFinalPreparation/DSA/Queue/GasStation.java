package DSA.Queue;

public class GasStation {
    public static void main(String... args){
        System.out.println(solve(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));
    }
    static int solve(int[] gas, int[] dist){
        int ans = 0;
        int gasReq = 0;
        int filledGas = 0;

        for(int i=0; i<gas.length; i++){
            //At current station the gas won't be enough for dist travelled
            //But at next station we can have more gas and less dist
            //So left over can be used to fill the negative dist
            gasReq += gas[i]-dist[i];

            filledGas +=gas[i]-dist[i];
            //if filled Gas is not enough then this can't be our ans
            if(filledGas<0){
                //I can't start from here so i+1 can be my possible ans
                ans = i+1;

                //Filled gas will be emptied as I can't  cover the dist from this gas station 
                //so I won't  fill the petrol from here
                filledGas = 0;
            }
        }

        //if after travelling through all station gas req is enough for me to travel to all distances 
        //then I have found an answer else -1
        if(gasReq<0){
            return -1;
        }
        return ans;
    }
}
