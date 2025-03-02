package I_RecursionBacktracking;

import java.util.Scanner;

public class Q05_powerLinearApproach {
    // Calculate n raised to the power p through linear approach
    // tc = O(p)
    public static int power(int n , int p ){
        if(p == 0){
            return 1;
        }
        int res = n * power( n , p-1);
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        scn.close();
        System.out.println(power(n , p));
    }
}
