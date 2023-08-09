package DSA.Lecture_4Recursion;


public class SkipCharacter {
    public static void main(String... args){
        System.out.println(skipCharacter("baccaad"));
    }
    static String skipCharacter(String up){
        if(up.isEmpty()){
            return "";
        }
        char c = up.charAt(0);
        if(c!='a')
            return c+up.substring(1);
        else
            return up.substring(1);
    }
}
