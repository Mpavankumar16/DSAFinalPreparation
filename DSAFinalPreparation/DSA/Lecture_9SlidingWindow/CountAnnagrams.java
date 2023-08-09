package DSA.Lecture_9SlidingWindow;
import java.util.*;
public class CountAnnagrams {
    public static void main(String... args){
        String sent = "aabaabaa";
        String word = "aaba";
        System.out.println(solve(sent, word));
    }
    static int solve(String sent, String word){
        Map<Character, Integer> temp  = new HashMap<>();
        int ans = 0;
        for(char c: word.toCharArray()){
            temp.put(c, temp.getOrDefault(c, 0)+1);
        }
        int count = temp.size();
        int i=0;
        int j = 0;
        while(j<sent.length()){
            char c = sent.charAt(j);
            if(temp.containsKey(c)){
                temp.put(c, temp.get(c)-1);
                if(temp.get(c)==0){
                    count--;
                }
            }
            if(j-i+1==word.length()){
                if(count==0)
                    ans++;
                
                char iThChar = sent.charAt(i);
                if(temp.containsKey(iThChar)){
                    if(temp.get(iThChar)==0){
                        count++;
                    }
                    temp.put(iThChar, temp.get(iThChar)+1);
                }
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
}
