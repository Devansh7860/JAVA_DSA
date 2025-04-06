package I_RecursionBacktracking;


public class Q12_firstIndexOccur {
    // Find the first occurence of an element in an array

    public static int firstIndexOccur(int[] arr , int ind , int x){

        if(ind == arr.length){
            return -1;
        }
        if(arr[ind] == x){
            return ind;
        }

        int fisa = firstIndexOccur(arr, ind+1, x);
        return fisa;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        System.out.println(firstIndexOccur(arr, 0, 2));
    }
}
