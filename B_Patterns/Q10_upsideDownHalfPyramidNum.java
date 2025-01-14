package B_Patterns;

public class Q10_upsideDownHalfPyramidNum {
    // upside down half pyramid pattern with numbers
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int n = 5;
        for (i = n; i > 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
