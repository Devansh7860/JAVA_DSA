package D_Arrays;

public class Q08_subarraysOfAnArray {
    // all subarays of an array
    // ------------------------------------------------------------------------------------
    public static void subarays(int[] arr) {
        
    // my brute force approach
        for (int i = 0; i < arr.length; i++) {
            int c = 1;
            while (c+i <= arr.length) {
                for (int j = i; j < c+i; j++) {
                    System.out.print(arr[j] + " ");
                }
                c++;
                System.out.println();
            }
        }

    // better approach
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j<arr.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        subarays(arr);
    }
}
