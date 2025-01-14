package D_Arrays;

public class Q14_waveTraversal2Dmatrix {
    // wave traversal of 2d matrix starting from bottom to top 
    public static void main(String[] args) {
        
        int[][] arr = { { 10, 20, 30, 8 }, { 40, 50, 60, 9 }, { 70, 80, 90, 10 } };
        for(int i = 0; i<arr[0].length; i++){
            if(i%2 == 0){
                for(int j = 0; j<arr.length; j++){
                    System.out.println(arr[j][i]);
                }
            }
            else{
                for(int j = arr.length-1; j>=0; j--){
                    System.out.println(arr[j][i]);
                }
                
            }
        }
    }
}
