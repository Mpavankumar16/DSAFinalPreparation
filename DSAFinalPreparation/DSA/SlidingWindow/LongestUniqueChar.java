package DSA.SlidingWindow;

import java.util.HashSet;

public class LongestUniqueChar {
    public static void main(String... args){
        System.out.println(lengthOfLongUniqueCharacters("pwwkew"));
    }
    public static int lengthOfLongUniqueCharacters(String s) {
        int ans = 0;
        int i=0;
        int j = 0;
        HashSet<Character> temp = new HashSet<>();
        char c;
        while(j<s.length()){
            c = s.charAt(j);
            while(!temp.isEmpty() && temp.contains(c)){
                temp.remove(s.charAt(i));
                i++;
            }
            if(!temp.contains(c)){
                temp.add(c);
                ans = Math.max(ans, j-i+1);
            }
            j++;
        }
        return ans;
    }
}
