import java.util.*;

public class SortBasedonFrequency {
    public static void main(String... args){
        String s = "ccaadddb";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        //Occurence count
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        //Sorting characters based on Occurence
        //priorityQueue<>  = new priorityQueue<>((a,b)->map.get(b)-map.get(a));
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b)->(map.get(b)-map.get(a)));

        //Building string
        StringBuilder ans = new StringBuilder();
        for(Character c: list){
            for(int i=0; i<map.get(c); i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
