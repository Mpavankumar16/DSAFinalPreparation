package DSA.Recursion;

public class Permutation {
    public static void main(String... args){
        permutation("", "abc");
    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first+c+second, up.substring(1));
        }
    }
}
