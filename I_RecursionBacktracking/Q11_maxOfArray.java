package I_RecursionBacktracking;

public class Q11_maxOfArray {

    public static int maxOfArray(int[] arr , int ind){

        if(ind == arr.length){
            return arr[arr.length-1];
        }
        int misa = maxOfArray(arr, ind+1);
        if(arr[ind] > misa){
            return arr[ind];
        }
        else{
            return misa;
        }

    }
    
    public static void main(String[] args) {
        int[] arr = {1,10,13,2,8};
        System.out.println(maxOfArray(arr, 0));
        
    }
}
