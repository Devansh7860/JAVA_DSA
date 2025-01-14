package C_MathsNumberSystem;

import java.util.Scanner;

public class Q02_fibonaciSeries {
    // FIBONACI SERIES
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        scn.close();
    }
}
