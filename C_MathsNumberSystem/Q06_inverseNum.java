package C_MathsNumberSystem;

import java.util.Scanner;

public class Q06_inverseNum {
    // INVERSE OF A NUMBER
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pos = 0;
        int num = 0;
        while (n != 0) {
            int a = n % 10;
            n = n / 10;
            pos++;
            num += pos * (int) Math.pow(10, a - 1);
        }
        System.out.println(num);

        scn.close();

    }
}
