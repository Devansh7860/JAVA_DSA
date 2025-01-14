package D_Arrays;
import java.util.Scanner;
public class Q06_rotateAnArray {
    // rotate an array 
    // --------------------------------------------------------------------------------------------------------------
    
    public static int[] reverse(int[] arr, int a , int b ) {
        int[] rot = arr.clone(); // to coppy array
        while(a<b){
            rot[a] = arr[b];
            rot[b] = arr[a];
            a++;
            b--;
        }
        return rot;
        
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
        int[] a1 = reverse(arr , 0 , n-k-1);
        int[] a2 = reverse(a1 , n-k , n-1);
        int[] rot = reverse(a2 , 0 , n-1);

        for(int i = 0; i<n; i++){
            System.out.print(rot[i] + " ");
        }

        sc.close();
    }
}
