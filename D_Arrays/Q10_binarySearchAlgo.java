package D_Arrays;

import java.util.*;

public class Q10_binarySearchAlgo {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the element to be found ");
        int n = scn.nextInt();
        scn.close();

        int low = 0;
        int max = arr.length - 1;
        
        while (low<=max) {
            int mid = (low + max) / 2;
            if (n == arr[mid]) {
                System.out.println("Found at index " + mid);
                return;
            } else if (n < arr[mid]) {
                max = mid - 1;
            } else if (n > arr[mid]) {
                low = mid + 1;
            }
        }

        System.out.println("Not found");
    }
}
