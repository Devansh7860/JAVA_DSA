package B_Patterns;

public class Q08_floydsTriangle {
    // floyds triangle
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int counter = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
