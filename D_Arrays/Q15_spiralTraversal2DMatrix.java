package D_Arrays;
import java.util.*;
public class Q15_spiralTraversal2DMatrix {
    // spiral traversal of a 2D matrix anticlockwise starting from top to bottm 
    public static void main(String[] args) {

        int[][] arr = { { 10, 20, 30, 40 },
                        { 50, 60, 70,80 },
                        { 90, 100,110,120 } };
        
        int startColInd = 0;
        int endColInd = arr[0].length-1 ;
        int startRowInd = 0 ;
        int endRowInd = arr.length-1 ;

        
        ArrayList<Integer> list = new ArrayList<>();
        int total = arr[0].length*arr.length;
        int count = 0;
        while(count < total){
            // left wall
            for(int i = startRowInd; i<= endRowInd && count < total; i++){
                list.add(arr[i][startColInd]);
                count++;
            }
            startColInd++;

            // bottom wall
            for(int i = startColInd; i<= endColInd && count < total; i++){
                list.add(arr[endRowInd][i]);
                count++;
            }
            endRowInd--;

            // right wall
            for(int i = endRowInd; i>= startRowInd && count < total; i--){
                list.add(arr[i][endColInd]);
                count++;
            }
            endColInd--;

            // top wall
            for(int i = endColInd; i>= startColInd && count < total; i--){
                list.add(arr[startRowInd][i]);
                count++;
            }
            startRowInd++;

        }

        for(int j = 0; j<list.size(); j++){
            System.out.print(list.get(j) + " ");
        }
    }
}
