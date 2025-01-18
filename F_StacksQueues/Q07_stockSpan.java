package F_StacksQueues;

import java.util.Stack;

public class Q07_stockSpan {

    // given an array 
    // instead of finding next greater element in left, 
    // we have to find the distance of next greater element in left from the current element.
    // if no nge for an element , then its (index+1) is its distance. 
    
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 9, 4, 1 };
        int[] ngedistance = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr.length-1);
        for(int i = arr.length -2 ; i>=0; i--){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                ngedistance[st.peek()] = st.peek() - i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ngedistance[st.peek()] = st.peek() + 1;
            st.pop();
        }

        for(int i = 0; i<ngedistance.length; i++){
            System.out.print(ngedistance[i] + " ");

        }
    }
}
