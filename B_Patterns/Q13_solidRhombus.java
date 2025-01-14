package B_Patterns;

public class Q13_solidRhombus {
    // solid rhombus
    // --------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = (n - i); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
