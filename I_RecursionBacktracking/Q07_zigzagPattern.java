package I_RecursionBacktracking;


public class Q07_zigzagPattern {
    // IDENTIFY THE PATTERN AND SOLVE FOR 4
    // input : 1 output : 111
    // input : 2 output : 211121112
    // input : 3 output : 321112111232111211123


    public static void pzz(int n){

        if(n == 0){
            return;
        }
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
     
    }
    
    public static void main(String[] args) {
        pzz(4);
    }
}
