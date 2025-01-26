package F_StacksQueues;

import java.util.Stack;

public class Q12_celebrityProblem {
    // given is a matrix of 0s and 1s. Principal diagonal is 0.
    // celebrity is that index who doesn't know anyone but everyone knows it
    // basically in the row of that index, all elements should be 0 and in the column of that index all elements should be 1 (except for the diagonal element which is 0) 
    
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1} , 
                       {1,0,1,0} , 
                       {0,0,0,0,} , 
                        {1,1,1,0}};
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length;i++){
            st.push(i);
        }

        while(st.size()>=2){
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1){
                st.push(j);
            }
            else{
                st.push(i);
            }

        }
        int pot = st.peek();
        for(int i = 0; i<arr.length; i++){
            if(i != pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("No celebrity");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
}
