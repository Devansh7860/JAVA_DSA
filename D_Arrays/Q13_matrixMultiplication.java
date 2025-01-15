package D_Arrays;

public class Q13_matrixMultiplication {
    // multiplication of two matrices
    // ----------------------------------------------------------------------------------

    public static int[][] multiplyMatrix(int[][] arr1, int[][] arr2) {
        int[][] multi = new int[arr1.length][arr2[0].length];
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                for(int k = 0; k< arr2.length; k++){
                    multi[i][j] += arr1[i][k]* arr2[k][j];
                }
            }



        }
           

        return multi;
        }


    

    public static void main(String[] args) {

        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arr2 = { { 10, 20, 30, 8 }, { 40, 50, 60, 9 }, { 70, 80, 90, 10 } };

        if (arr1[0].length == arr2.length) {
            int[][] multi = multiplyMatrix(arr1, arr2);

            for (int i = 0; i < multi.length; i++) {
                for (int j = 0; j < multi[0].length; j++) {
                    System.out.print(multi[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices can't be multiplied bro");
        }

    }
}
