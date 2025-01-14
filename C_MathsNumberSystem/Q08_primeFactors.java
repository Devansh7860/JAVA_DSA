package C_MathsNumberSystem;

import java.util.Scanner;

public class Q08_primeFactors {
    // PRIME FACTORS OF A NUMBER
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 2;
        while (n != 1 && i * i <= n) {
            if (n % i == 0) {
                n = n / i;
                System.out.println(i);
            } else {
                i++;
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
        scn.close();
    }
}
