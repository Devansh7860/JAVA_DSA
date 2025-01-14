package B_Patterns;

public class Q11_binaryTriangle {
    // 101 binary triangle
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int num = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                if (num == 1) {
                    num = 0;
                } else {
                    num = 1;
                }
            }
            System.out.println();

        }

    }
}
