package DSA.Lecture_9SlidingWindow;

public class AllSubArrayWithSumK {
    public static void main(String... args){
        //int[] nums = {1,0,1,0,1};
        //int ans = approach2(nums, 2) - approach2(nums, 2-1);

        int[] nums = {2,2,1,1,2,2,1,2};
        int ans = approach3(nums, 2);
        System.out.println(ans);
    }
    //Means sub array having sum = and < than sum
    static int approach2(int[] nums, int goal){
        //Its' a binary sub array so sum can't be less than 0
        if(goal<0){
            return 0;
        }
        int i=0;
        int j = 0;
        int sum = 0;
        int count = 0;
        while(j<nums.length){
            sum +=nums[j];

            while(sum>goal){
                sum -=nums[i];
                i++;
            }
            /**
            counting every possible subarry with sum<=k;
            If we reached till here our sum is always<=k
            Why j-i+1

            1  => sub array formed is only 1
            10 => here sub array formed is not 1 but 2
            10 and 0 alone
            So It's always length many sub arrays are formed

             */
            count +=j-i+1;
            j++;
        }
        return count;
    }

    static int approach3(int[] nums, int k) {
        int j = 0;
        int i = 0;
        int odd = 0;
        int count = 0;
        int total = 0;
        // 2 2 1 1 2 2 1 2
        while(i<nums.length){
            if ((nums[i] & 1)==1) {
                odd++;
                if (odd >= k) {
                    count = 1;
                    while ((nums[j++] & 1)!=1){
                        count++;
                    }
                    total += count;
                }
            } 
            else if (odd >= k) 
                total += count;
            i++;
        }
        return total;
    }
}
