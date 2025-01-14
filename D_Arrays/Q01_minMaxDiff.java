package D_Arrays;

import java.util.Scanner;

public class Q01_minMaxDiff {
// difference between max and min value in an array
// --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<n; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    
        sc.close();

    }
}
