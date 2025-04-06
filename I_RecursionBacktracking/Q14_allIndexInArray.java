package I_RecursionBacktracking;

public class Q14_allIndexInArray {
    // Return an array having all indexes of occurence of an element in an array
    // fsf = found so far counter

    public static int[] allIndexInArray(int[] arr , int ind , int x , int fsf){
       /*  if(ind == arr.length){
            int[] res = new int[fsf];
            if(fsf == 0){
                res[0] = -1;
            }
            return res;
        }
        if(arr[ind] == x){
            fsf++;
        }
        int[] aisa = allIndexInArray(arr, ind+1, x, fsf);
        if(arr[ind] == x){
            aisa[fsf-1] = ind;
        }
        return aisa;
    */
    // BETTER WAY OF WRITING SAME CODE
     
        if(ind == arr.length){
            int[] res = new int[fsf];
            if(fsf == 0){
                res[0] = -1;
            }
            return res;
        }
        if(arr[ind] == x){
            int[] aisa = allIndexInArray(arr, ind+1, x, fsf+1);
            aisa[fsf] = ind;
            return aisa;
        }
        else{
            int[] aisa = allIndexInArray(arr, ind+1, x, fsf);
            return aisa;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,0,0,2};
        int[] res = allIndexInArray(arr, 0, 2, 0);
        for(int ind : res){
            System.out.print(ind + " , ");
        }
    }
}
