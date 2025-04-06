package I_RecursionBacktracking;

public class Q13_lastIndexOccur {
    // We have to find the last occurence index of an element in an array
    public static int lastIndexOccur(int[] arr , int ind , int x){

        
        if(arr.length-ind-1 == -1){
            return -1;
        }
        if(arr[arr.length-ind-1] == x){
            return arr.length-ind-1;
        }

        int lisa = lastIndexOccur(arr, ind+1, x);
        return lisa;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        System.out.println(lastIndexOccur(arr, 0, 2));
    }
}
