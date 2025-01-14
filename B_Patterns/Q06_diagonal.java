package B_Patterns;

public class Q06_diagonal {
    // diagonal
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        // another approach using matrix
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
