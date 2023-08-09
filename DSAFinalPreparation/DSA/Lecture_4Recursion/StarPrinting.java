package DSA.Lecture_4Recursion;

public class StarPrinting {
    public static void main(String... args){
        starPrinter(0,4);
    }
    static void starPrinter(int c, int r){
        if(r==0){
            return;
        }
        
        System.out.print("*");
        if(c==r){
            System.out.println();
            starPrinter(0, r-1);
        }
        else
            starPrinter(c+1, r);
    }
}
