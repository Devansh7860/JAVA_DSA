package C_MathsNumberSystem;

import java.util.Scanner;

public class Q09_pythogoreanTriplet {
    // TO CHECK PYTHOGOREAN TRIPLET
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        if (max == n1 && n2 * n2 + n3 * n3 == n1 * n1) {
            System.out.println("Pythagoras Triplet");
        } else if (max == n2 && n1 * n1 + n3 * n3 == n2 * n2) {
            System.out.println("Pythagoras Triplet");
        } else if (max == n3 && n1 * n1 + n2 * n2 == n3 * n3) {
            System.out.println("Pythagoras Triplet");
        } else {
            System.out.println("Not Pythogoras Triplet");
        }
        scn.close();
    }
}
