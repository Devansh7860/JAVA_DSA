package B_Patterns;

public class Q04_diamond {
    // diamond
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int n = 5;

        int sp = n / 2;
        int st = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= st; j++) {
                System.out.print("*");
            }

            if (i <= n / 2) {
                sp--;
                st += 2;

            } else {
                sp++;
                st -= 2;
            }
            System.out.println();

        }

    }
}
