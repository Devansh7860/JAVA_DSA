package F_StacksQueues;
import java.util.*;
public class Q09_slidingWindowMaximum {

    public static void main(String[] args) {
        int[] arr = {2,9,3,8,7,12,6,14};
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        scn.close();
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        st.push(0);
        for(int i = 1; i<arr.length; i++){
            while(st.size()>0 && arr[i] > arr[st.peek()]){
                nge[st.peek()] = i;
                st.pop();
            }
        
            st.push(i);
        }
        while(st.size()>0){
            nge[st.peek()] = arr.length;
            st.pop();
        }

        int j = 0;
        for(int i = 0; i<=arr.length-k; i++){
            if(j<i){
                j = i;
            }
            while(nge[0] < i+k){
                j = nge[j];
            }
            System.out.println(arr[j]);

        
        }
    }
    
}
