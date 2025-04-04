package I_RecursionBacktracking;

public class Q09_displayArr {
    public static void displayArr(int[] arr , int ind){
        if(ind == arr.length){
            return;
        }
        System.out.println(arr[ind]);
        displayArr(arr, ind+1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        displayArr(arr, 0);
    }
}
