package C_MathsNumberSystem;
import java.util.Scanner;
public class Q05_printDigitsRightToLeft {
    // PRINTING DIGITS OF A NUMBER FORM RIGHT TO LEFT
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n != 0) {
            System.out.println(n % 10);
            n = n / 10;
        }
        scn.close();
    }
}
