package DSA.Lecture_9SlidingWindow;

public class MaxLengthSubStringWithRepeatingCharcters {
    public static void main(String... args){
        System.out.println(characterReplacement("AABABBA", 1));
    }
    //424. Leetcode
    // Find Max Length SubString wtih repeating characters
    //Have a choice to change K characters to that repeating character
    public static int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int i=0;
        int j = 0;
        int ans = 0;
        int maxFreq = 0;
        while(j<s.length()){
            arr[s.charAt(j)-'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(j)-'A']);

            //AABAB => max freq is 3
            //I can replace 2 character to get bigger window
            // window - maxfreq of occuring elem
            int replacableChar = j-i+1 - maxFreq;

            //if I can replace those many val then my ans found
            if(replacableChar>k){
                arr[s.charAt(i)-'A']--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}
