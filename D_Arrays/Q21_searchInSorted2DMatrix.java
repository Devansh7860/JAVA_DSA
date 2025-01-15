package D_Arrays;
import java.util.Scanner;

public class Q21_searchInSorted2DMatrix {
    // find an element in a 2D sorted(sorted in aesc order both row and column wise) matrix
    // this approach is kind of a binary search
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 }};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search ");
        int n = sc.nextInt();
        sc.close();
        
        int i = 0;
        int j = arr[0].length - 1;
        while(i<arr.length && j>=0){
            if(n == arr[i][j]){
                System.out.println(i + "," + j);
                return; 
            }
            else if(arr[i][j] < n){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("Element not present in the matrix");
    }

}
