package B_Patterns;

public class Q01_hollowRectangle {
    // pattern to print a hollow rectangle
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        for (i = 1; i <= 4; i++) {
            if (i == 1 || i == 4) {
                for (j = 1; j <= 5; j++) {
                    System.out.print("*");
                }

            } else {
                for (j = 1; j <= 5; j++) {
                    if (j == 1 || j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();

        }
        // Optimised solution for the above problem (matrix approach)
        int r = 4;
        int c = 5;
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
