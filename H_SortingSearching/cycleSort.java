package H_SortingSearching;

public class cycleSort {
    // Cyclic Sort Algorithm
    // used when elements are in continuous range from 1 to n or 0 to n
    // tc = O(n)
    // sc = O(1)

    public static void cycle(int[] arr){
        for(int i = 0; i<arr.length; i++){
            while(i != arr[i] - 1){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }

    }
      
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
        cycle(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
