package H_SortingSearching;

public class bubbleSort {
    // Bubble Sort algorithm

    public static void bubble(int[] arr){
        int i = 0;
        while (i < arr.length-1) {
            boolean swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if(swap == false){ // if no swapping takes place , it means the list is sorted so break;
                break;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        bubble(arr);
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
