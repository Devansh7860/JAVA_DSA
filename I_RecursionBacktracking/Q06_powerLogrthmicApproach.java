package I_RecursionBacktracking;

import java.util.Scanner;

public class Q06_powerLogrthmicApproach {
    // Calculate n raised to the power p through logarithmic approach
    // tc = O(logp)
    
    public static int power(int n , int p){
        if(p == 0){
            return 1;
        }
        int res = 0;
        int x = power(n,p/2);
        if(p%2 == 0){
            res = x*x;
        }
        else if(p%2 != 0){
            res = n*x*x;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        scn.close();
        System.out.println(power(n,p));
    }
}
