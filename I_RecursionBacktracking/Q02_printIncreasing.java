package I_RecursionBacktracking;

import java.util.Scanner;

public class Q02_printIncreasing {
    // Print from 1 to n 
    public static void printInc(int n ){
        if(n == 0){
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        printInc(n);
    }
}
