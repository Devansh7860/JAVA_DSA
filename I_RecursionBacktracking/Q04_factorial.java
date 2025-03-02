package I_RecursionBacktracking;

import java.util.Scanner;

public class Q04_factorial {
    public static int fact(int n ){
        if(n == 0){
            return 1;
        }
        int res = n * fact(n-1);
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.println(fact(n));
    }
}
