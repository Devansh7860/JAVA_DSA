package B_Patterns;

public class Q09_floydsNumberTriangle {
    // floyds triangle with fibonaci sequence
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {


        int i = 1;
        int j = 1;
        int c = 0;
        int a = 0;
        int b = 1;
        for (i = 1; i <= 5; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }
}
