package D_Arrays;

import java.util.Scanner;

public class Q05_reverseAnarray {
    // REVERSE AN ARRAY
    // --------------------------------------------------------------------------------------------------------------
   
  
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
        sc.close();

    }
}
