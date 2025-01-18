package F_StacksQueues;

import java.util.Stack;

public class Q08_largestAreaHistogram {
    // given an array
    // we have to find the largest area possible of the histogram

    public static void nseFunc(Stack<Integer> st , int[] arr , int[] nseIndex , int n) {
        
        boolean res = false;
        if(n == arr.length - 2){
            res = true;
        }
        else if (n == 1){
            res = false;
        }

        
        for(int i = n; res ? i>=0: i<arr.length; i = res ? i-1 : i+1){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                nseIndex[st.peek()] = i;
                st.pop();
            }
            st.push(i);    
        }
        while(st.size()>0){
            nseIndex[st.peek()] = res ? -1 : arr.length;
            st.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,1,6,7,5,2,5};

        int[] nseLeftIndex = new int[arr.length];
        Stack<Integer> st1 = new Stack<>();
        st1.push(arr.length-1);
        nseFunc(st1, arr, nseLeftIndex, arr.length-2);

        Stack<Integer> st2 = new Stack<>();
        int[] nseRightIndex = new int[arr.length];
        st2.push(0);
        nseFunc(st2, arr, nseRightIndex , 1);

        int maxArea = 0;
        for(int i = 0; i < arr.length; i++){
            int width = nseRightIndex[i] - nseLeftIndex[i] - 1;
            int area = arr[i] * width;
            if(area>maxArea){
                maxArea = area;
            }
        }
        System.out.println(maxArea);

    }
}
