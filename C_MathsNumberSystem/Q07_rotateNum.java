package C_MathsNumberSystem;

import java.util.Scanner;

public class Q07_rotateNum {
    // ROTATE A NUMBER
    // --------------------------------------------------------------------------------------------------------------
    // k can be negative as well

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int temp = n;
        int nod = 0;
        while (n != 0) {
            n = n / 10;
            nod++;
        }
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }

        int a = temp / ((int) Math.pow(10, k));
        int b = temp % ((int) Math.pow(10, k));
        int c = nod - k;
        int num = b * (int) Math.pow(10, c) + a;
        System.out.println(num);

        scn.close();
    }
}
