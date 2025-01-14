package C_MathsNumberSystem;

import java.util.Scanner;

public class Q11_conversionAnyBase {
    // Any base to any base conversion
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int numbase = scn.nextInt();
        int base = scn.nextInt();

        int finalnum = anyBaseToAnyBaseConversion(num, base, numbase);
        System.out.println(finalnum);
        scn.close();

    }

    public static int anyBaseToAnyBaseConversion(int x, int y, int z) {

        int finalnum = 0;
        int place = 0;
        while (x != 0) {
            finalnum = 10;
            int rem = x % y;
            x = x / y;
            finalnum = finalnum + (rem * (int) Math.pow(z, place));
            place++;
        }
        return finalnum;
    }
}
