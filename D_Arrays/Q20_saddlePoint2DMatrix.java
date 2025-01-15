package D_Arrays;

public class Q20_saddlePoint2DMatrix {
    // find the saddle point of a square matrix
    // saddle point is least in its row and maximum in its column
    // there exists only one saddle point in a matrix or none

    public static void main(String[] args) {
        int[][] arr = { { 14, 3, 2, 1 },
                        { 8, 6, 7, 5 },
                        { 11, 10, 9, 12 }, 
                        { 13, 14, 15, 16 }};

        for (int i = 0; i < arr.length; i++) {

            int svj = 0; // smallest value column
            for (int j = 1; j < arr.length; j++) {
                if(arr[i][j] < arr[i][svj]){
                    svj = j;
                }
            }
            boolean sdlpnt = true;
            for(int k = 0; k<arr.length; k++){
                if(arr[i][svj] < arr[k][svj]){
                    sdlpnt = false;
                    break;
                }
            }
            if(sdlpnt){
                System.out.println(i + "," + svj);
                return;
            }
            
        }
        System.out.println("Saddle Point doesn't exist for this matrix");

    }
}
