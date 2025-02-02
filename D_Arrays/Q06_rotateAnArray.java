package D_Arrays;
import java.util.Scanner;
public class Q06_rotateAnArray {
    // rotate the array by k steps and return the rotated array
    // --------------------------------------------------------------------------------------------------------------
    
    public static void reverse(int[] arr, int a , int b ) {
        while(a<b){
            arr[a] = arr[b];
            arr[b] = arr[a];
            a++;
            b--;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to be rotated: ");
        int k = sc.nextInt();
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        k = k%n;
        
        if(k<0){
            k += n;
        }

        // we are rotating the original array to solve in O(1) space complexity
        // we can also store result in another array but then it will become O(N)
        reverse(arr , 0 , n-1);
        reverse(arr , 0 , k-1);
        reverse(arr , k , n-1);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
