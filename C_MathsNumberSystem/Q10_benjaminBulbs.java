package C_MathsNumberSystem;

import java.util.Scanner;

public class Q10_benjaminBulbs {
    // BENJAMIN BULBS
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
        scn.close();

    }
}
