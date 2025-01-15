package D_Arrays;

public class Q17_rotateMatrix {
    // rotate a square matrix by 90 degree in right direction
    // ------------------------------------------------------------------------------
    public static void main(String[] args) {

        // my approach (i allocated another 2D matrix)
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] rotated = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                rotated[j][arr.length - i - 1] = arr[i][j];
            }
        }

        // another approach (directly rotating the given matrix)
        // first take transpose then reverse the matrix

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            int l = arr[0].length-1;
            while(j<l){
                int temp = arr[i][j];
                arr[i][j] = arr[i][l];
                arr[i][l] = temp;
                j++;
                l--;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        

    }
}
