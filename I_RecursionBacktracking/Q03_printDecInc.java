package I_RecursionBacktracking;

import java.util.Scanner;

public class Q03_printDecInc {
    // First print from n to 1 then from 1 to n 
    public static void printDecInc(int n ){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        printDecInc(n);
    }
}
