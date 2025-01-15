package D_Arrays;

public class Q16_exitPoint2DMatrix {
    // it is matrix made up of 0s and 1s only.
    // starts in east direction from the (0,0) element
    // moves in same direction as long as it encounters 0
    // turns 90deg right when it encounters 1
    // exit point is the cordinate from which it enters out of the matrix.
    public static void main(String[] args) {
        int[][] matrix = { { 0, 0, 1, 0 },
                           { 1, 0, 0, 1 },
                           { 0, 0, 0, 1 },
                           { 1, 0, 1, 0 } };

        int i = 0;
        int j = 0;
        int direc = 0;
        while (true) {
            direc = (direc + matrix[i][j]) % 4;
            if (direc == 0 ) {
                j++;
            } else if (direc == 1) {
                i++;
            } else if (direc == 2) {
                j--;
            } else {
                i--;
            }

            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i == matrix.length){
                i--;
                break;
            }
            else if(j == matrix[0].length){
                j--;
                break;
            }
        }
        System.out.println(i + "," + j);


    }
}
