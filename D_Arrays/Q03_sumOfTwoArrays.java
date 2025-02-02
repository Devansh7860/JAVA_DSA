package D_Arrays;

import java.util.Scanner;

public class Q03_sumOfTwoArrays {
    // SUM OF TWO ARRAYS
    // --------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] sum = new int[n2 > n ? n2 : n];
        int i = arr.length - 1;
        int j = arr2.length - 1;

        int k = sum.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = c;
            if(i>=0){
                d += arr[i];
                i--;
            }
            if (j >=0){
                d += arr2[j];
                j--;
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            k--;
        }

        if (c != 0) {
            System.out.print(c);
        }
        for (int val : sum) {
            System.out.print(val);
        }
        sc.close();
    }
}
