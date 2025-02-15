package H_SortingSearching;

public class insertionSort {
    // Insertion sort algorithm

    public static void insertion(int[] arr){

        for(int i = 0; i<= arr.length-2; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }

    }
    
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        insertion(arr);
        for(int elem : arr){
            System.out.print(elem + " ");
        }

    }
}
