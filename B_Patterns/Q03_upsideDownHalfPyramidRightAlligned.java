package B_Patterns;

public class Q03_upsideDownHalfPyramidRightAlligned {
    // upside down half pyramid right aligned
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = n; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
