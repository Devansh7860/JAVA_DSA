package B_Patterns;

public class Q07_oppositeDiagonal {
    // Opposite diagonal
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {


        int i = 1;
        int j = 1;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
