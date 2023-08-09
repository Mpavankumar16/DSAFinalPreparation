package DSA.Lecture_4Recursion;

public class power {
    public static void main(String... args){
        System.out.println(pow(2, 6));
    }
    static int pow(int x, int n){
        if(n==0)
            return 1;
        
        if((n&1)==1){ 
            return pow(x, n/2) * pow(x, n/2) * x;
        }
        else{
            return pow(x, n/2) * pow(x, n/2);
        }
    }
}
