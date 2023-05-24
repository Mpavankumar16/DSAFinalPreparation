public class Strings{
    public static void main(Stirng... args){
        char[] c = {"h","e","l","l","o"};
        reverseString(c);
    }
    public void reverseString(char[] c) {
        int s = 0;
        int e = c.length-1;
        while(s<e){
            int temp = c[s];
            c[s] = c[e];
            c[e] = temp;
        }
        s++;
        e--;
    }
}