package H_SortingSearching;

public class selectionSort {
    // Selection sort algorithm

    public static void selection(int[] arr){
        
        for(int i = 0; i<arr.length-1; i++){
            int maxind = 0;
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j] > arr[maxind]){
                    maxind = j;
                }
            }
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] =  arr[maxind];
            arr[maxind] = temp;
            
        }

    }
    
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        selection(arr);
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }

    }
}
