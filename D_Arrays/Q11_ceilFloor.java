package D_Arrays;
import java.util.*;
public class Q11_ceilFloor {
    // we are required to print the ceil and floor of a given element in an array.
    // 
    
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the element ");
        int n = scn.nextInt();
        scn.close();

        int lo = 0;
        int hi = arr.length-1;
        int ceil = 0;
        int floor = 0;
        
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if (n == arr[mid]) {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
            else if (n<arr[mid]) {
                hi = mid-1;
                floor = arr[mid];
            }
            else if (n>arr[mid]) {
                lo = mid+1;
                ceil = arr[mid];
            }
        }
        System.out.println(ceil + "," + floor);


        
    
    }
}
