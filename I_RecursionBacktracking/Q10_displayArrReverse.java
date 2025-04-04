package I_RecursionBacktracking;

public class Q10_displayArrReverse {
    
    public static void displayArrReverse(int[] arr , int ind){
        if(ind == arr.length){
            return;
        }
        displayArrReverse(arr, ind+1);
        System.out.println(arr[ind]);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        displayArrReverse(arr, 0);
    }
}
