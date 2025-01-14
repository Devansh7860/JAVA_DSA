package C_MathsNumberSystem;
import java.util.Scanner;
public class Q04_printDigitsLeftToRight {
    // PRINTING DIGITS OF A NUMBER FORM LEFT TO RIGHT
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int div = (int) Math.pow(10, count - 1);
        while (div != 0) {
            int a = n / div;
            System.out.println(a);
            n = n % div;
            div = div / 10;
        }

        scn.close();
    }
}
