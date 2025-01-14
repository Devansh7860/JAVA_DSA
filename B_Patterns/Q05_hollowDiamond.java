package B_Patterns;

public class Q05_hollowDiamond {
    // hollow diamond
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int n = 5;
        int sp2 = 1;
        int st2 = n + 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (st2 / 2); j++) {
                System.out.print("*");
            }
            for (j = 1; j <= sp2; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (st2 / 2); j++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                sp2 += 2;
                st2 -= 2;
            } else {
                sp2 -= 2;
                st2 += 2;
            }
            System.out.println();

        }

    }
}
