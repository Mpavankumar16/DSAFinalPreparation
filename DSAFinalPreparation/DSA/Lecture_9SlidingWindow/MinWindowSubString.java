package DSA.Lecture_9SlidingWindow;

import java.util.HashMap;

public class MinWindowSubString {
    public static void main(String... args){
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    //Min window with the given subString
    public static String minWindow(String s, String givenString) {
        int ansI = -1;
        int ansJ = -1;
        int ans = Integer.MAX_VALUE;
        int i=0;
        int j = 0;
        HashMap<Character, Integer> temp = new HashMap<>();
        for(char c: givenString.toCharArray()){
            temp.put(c, temp.getOrDefault(c, 0)+1);
        }
        int count = temp.size();
        char c;
        while(j<s.length()){
            c = s.charAt(j);
            if(temp.containsKey(c)){
                temp.put(c, temp.get(c)-1);
                if(temp.get(c)==0){
                    count--;
                }
            }
            while(count==0){
                if(ans>j-i+1){
                    ansI = i;
                    ansJ = j;
                    ans = j-i+1;
                }
                c = s.charAt(i);
                if(temp.containsKey(c)){
                    temp.put(c, temp.get(c)+1);
                    if(temp.get(c)>0){
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        if(ansI==-1 && ansJ==-1){
            return "";
        }
        return s.substring(ansI, ansJ+1);
    }
}
