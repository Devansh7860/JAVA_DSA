package F_StacksQueues;

import java.util.Stack;

public class Q06_nextSmallerElementInLeft {
    // given is an array
    // for each element find the next smaller element to the left and put it in another array in the corresponding index.
    // next smaller means immediate smaller
    // if no nse exists for an element then its nse is -1

    public static void main(String[] args) {
        
        int[] arr = {1,4,5,3,2,4,2,6};
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr.length-1);

        for(int i = arr.length -2; i>=0; i--){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                nse[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            nse[st.peek()] = -1;
            st.pop();
        }

        for(int i = 0; i<nse.length; i++){
            System.out.print(nse[i] + " ");
        }

    }

}
