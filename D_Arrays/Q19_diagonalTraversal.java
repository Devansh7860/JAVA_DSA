package D_Arrays;

public class Q19_diagonalTraversal {
    // in a square matrix print all the elements of the upper triangle diagonally.

    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3, 4 }, 
                        { 5, 6, 7, 8 }, 
                        { 9, 10, 11, 12 }, 
                        { 13, 14, 15, 16 }};

        // this will print the main diagonal elements (1,6,11,16)
        /* for(int i = 0, j = 0; j<arr.length; i++ , j++){
            System.out.println(arr[i][j]);
        } */

        // this will print the next diagonal elements in the upper triangle (2,7,12)
        /* for(int i = 0, j = 1; j<arr.length; i++ , j++){
            System.out.println(arr[i][j]);
        } */

        // and so on..........

        // this will print all the diagonals together 
        for(int g = 0; g<arr.length; g++){
            for(int i = 0, j = g; j<arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }

        

    }

}