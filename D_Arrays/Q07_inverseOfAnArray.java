package D_Arrays;

public class Q07_inverseOfAnArray {
    //inverse of an array 
    //---------------------------------------------------------------------------------------
    
    public static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            inv[temp] = i;
        }
        return inv;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {4,1,0,3,2};
        int[] inv = inverse(arr);
        for(int i = 0; i<inv.length; i++){
            System.out.print(inv[i] + " ");
        }
    }
}
