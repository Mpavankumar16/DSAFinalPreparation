package DSA.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestKUniqueCharactersInSubString {
    public static void main(String... args){
        System.out.println(longestkSubstr("aabcc", 3));
    }
    public static int longestkSubstr(String s, int k) {
       int i=0;
       int j=0;
       Map<Character, Integer> temp = new HashMap<>();
       int ans = 0;
       char c;
       while(j<s.length()){
           c = s.charAt(j);
           temp.put(c, temp.getOrDefault(c, 0)+1);
           if(temp.size()==k){
               ans = Math.max(ans, j-i+1);
           }
           while(temp.size()>k){
               c= s.charAt(i);
               temp.put(c, temp.get(c)-1);
               if(temp.get(c)==0){
                   temp.remove(c);
               }
               i++;
           }
           j++;
       }
       return ans;
    }
}
