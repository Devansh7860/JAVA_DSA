package B_Patterns;

public class Q02_halfPyramidRightAlligned {
    // half pyramid right aligned
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int r = 4;
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= r; j++) {
                if (i + j >= (r + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        // Another approach
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
