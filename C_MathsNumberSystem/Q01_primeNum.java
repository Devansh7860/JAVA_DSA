package C_MathsNumberSystem;

import java.util.Scanner;

public class Q01_primeNum {

    // PRIME NUMBER LOGIC
    // --------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        // 1) basic approach

        /*
         * Scanner scn = new Scanner(System.in);
         * int n = scn.nextInt();
         * for(int i = 1; i<=n; i++){
         * int num = scn.nextInt();
         * int count = 0;
         * for(int j = 1; j<=num; j++){
         * if(num%j == 0){
         * count = count + 1;
         * }
         * }
         * if(count == 2){
         * System.out.println("Prime");
         * }
         * else{
         * System.out.println("Not Prime");
         * }
         */

        // 2) optimised approach considering time complexity
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = scn.nextInt();
            int count = 0;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    System.out.println("Not Prime");
                    count = count + 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            }

        }
        scn.close();

    }
}
