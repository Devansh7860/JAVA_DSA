package D_Arrays;
import java.util.Scanner;

public class Q02_barChart {
// BAR CHART
// --------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];  
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i<n; i++){
            if(max<arr[i]){
                max = arr[i];
            }

        }

        for(int floor = max; floor>=1; floor--){
            for(int j = 0; j<n; j++){   
                if(arr[j]<floor){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
