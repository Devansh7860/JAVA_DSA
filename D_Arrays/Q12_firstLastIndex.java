package D_Arrays;

import java.util.*;

public class Q12_firstLastIndex {
    // we have to print the first occurence of the element and the last occurence of
    // the element in the array
    // solve using binary search

    public static void main(String[] args) {

        int[] arr = { 10, 20, 20, 40, 40, 40, 65, 70, 90, 100 };

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the element");
        int n = scn.nextInt();
        scn.close();

        int lo = 0;
        int hi = arr.length - 1;
        int li = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (n < arr[mid]) {
                hi = mid - 1;

            } else if (n > arr[mid]) {
                lo = mid + 1;
            } else {
                li = mid;
                lo = mid + 1;

            }
        }

        lo = 0;
        hi = arr.length - 1;
        int fi = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (n < arr[mid]) {
                hi = mid - 1;

            } else if (n > arr[mid]) {
                lo = mid + 1;
            } else {
                fi = mid;
                hi = mid - 1;

            }
        }

        System.out.println(fi + "," + li);

    }

}
