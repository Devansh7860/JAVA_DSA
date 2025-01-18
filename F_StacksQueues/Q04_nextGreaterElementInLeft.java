package F_StacksQueues;
import java.util.*;

public class Q04_nextGreaterElementInLeft {
    // given is an array
    // for each element find the next greater element to the left and put it in another array in the corresponding index.
    // next greater means immediate greater 
    // if no nge exists for an element then its nge is -1

    public static void main(String[] args) {

    // Approach 1 (from left to right)

        int[] arr = { 1, 3, 2, 5, 9, 4, 1 };
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        nge[0] = -1;
        st.push(arr[0]);

        for(int i = 1 ; i<arr.length; i++){
            while(st.size() > 0 && arr[i] >= st.peek() ){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for (int i = 0; i < nge.length; i++) {
            System.out.print(nge[i] + " ");
        }
        System.out.println();

    // Approach 2 (from right to left)

        int[] nge2 = new int[arr.length];
        Stack<Integer> st2 = new Stack<>();

        st2.push(arr.length-1);
        for(int i = arr.length -2; i>=0; i--){
            while(st2.size() > 0 &&  arr[i] > arr[st2.peek()]){
                nge2[st2.peek()] = arr[i];
                st2.pop();
            }

            st2.push(i);
        }
        
        while(st2.size() >0){
            nge2[st2.peek()] = -1;
            st2.pop();
        }

        for (int i = 0; i < nge2.length; i++) {
            System.out.print(nge[i] + " ");
        }


        
    }
}
