import java.util.Arrays;

public class ReverseString{
    public static void main(String... args){
        String[] c = {"h","e","l","l","o"};
        System.out.println("Ok");
        reverseString(c);
        System.out.println("Ok");
        System.out.println(Arrays.toString(c));
    }
    public static void reverseString(String[] c) {
        int s = 0;
        int e = c.length-1;
        while(s<e){
            String temp = c[s];
            c[s] = c[e];
            c[e] = temp;
        }
        s++;
        e--;
    }
}