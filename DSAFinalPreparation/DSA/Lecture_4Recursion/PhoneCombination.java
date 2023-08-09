package DSA.Lecture_4Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneCombination {
    Map<String, String> hash;
    public List<String> letterCombinations(String digits) {
        hash = new HashMap<>();
        hash.put("2", "abc");
        hash.put("3", "def");
        hash.put("4", "ghi");
        hash.put("5", "jkl");
        hash.put("6", "mno");
        hash.put("7", "pqrs");
        hash.put("8", "tuv");
        hash.put("9", "wxyz");
        return solve(digits, "", 0, new ArrayList<>());
    }
    List<String> solve(String digits, String p, int index, List<String> ans){
        if(index==digits.length()){
            if(!p.isEmpty()){
                ans.add(p);
            }
            return ans;
        }
        String val = hash.get(digits.charAt(index)+"");
        for(int i=0; i<val.length(); i++){
            solve(digits, p+val.charAt(i), index+1, ans);
        }
        return ans;
    }
}
