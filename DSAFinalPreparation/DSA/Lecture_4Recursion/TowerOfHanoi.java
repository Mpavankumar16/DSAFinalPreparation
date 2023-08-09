package DSA.Lecture_4Recursion;

public class TowerOfHanoi {
    public static void main(String... args){
        th(3, 'A', 'B','C');
    }
    static void th(int n, char A, char B, char C){
        // It's not a base case
        //Consider this as edge case when someone passes n as 0 then obviously we should return 
        if(n==0){
            return;
        }

        //Having faith that all the disks will be moved to A -> C using B
        th(n-1, A, C, B);
        //Current disk will be left which I can move directly to B
        System.out.println(n+": "+A+"->"+B);
        //Now Having faith that all the disk that are on C -> B
        //In correct order using A
        th(n-1, C, B, A);
    }
}
