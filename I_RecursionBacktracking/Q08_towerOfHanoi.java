package I_RecursionBacktracking;

public class Q08_towerOfHanoi {
    
    public static void toh(int n , char t1 , char t2 , char t3){
        if(n == 0){
            return;
        }
        toh(n-1 , t1 , t3 , t2);
        System.out.println(n + "[ " + t1 + "->" + t2 + " ]");
        toh(n-1 , t3 , t2 , t1);
    }

    public static void main(String[] args) {
        char t1 = 'A';
        char t2 = 'B';
        char t3 = 'C';

        int disc = 3;
        toh(disc,t1,t2,t3);

    }
}
