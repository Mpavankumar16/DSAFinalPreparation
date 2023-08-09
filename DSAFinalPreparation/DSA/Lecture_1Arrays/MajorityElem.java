package DSA.Lecture_1Arrays;

public class MajorityElem {
    public static void main(String... arg) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int maj = 0;
        for(int i=0; i<nums.length; i++){
            if(count==0)
                maj = nums[i];
            
            if(maj==nums[i])
                count++;
            else
                count--;
        }
        
        return maj;
    }
}
