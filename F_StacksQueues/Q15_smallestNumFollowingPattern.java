package F_StacksQueues;

import java.util.Stack;

public class Q15_smallestNumFollowingPattern {
    // expression is of the form "ddiidi"
    // max length of exp can be 8
    // d = decrease , i = increase
    // make the smallest no. following the pattern using single digits 1-9 without repitition
    
    
    public static void main(String[] args) {

    // MY APPROACH 
        String exp = "ddiidi";
        int[] arr = new int[exp.length()+1];
        Stack<Character> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        int num = 0;
        for(int i = 0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            st.push(ch);
            st2.push(i);

            if(ch == 'i'){
                while(st.size() > 0){
                    num++;
                    arr[st2.peek()] = num;
                    st.pop();
                    st2.pop();
                }

            }
        }
        if(st.size() != 0){
            st.push('d');
            st2.push(st2.peek()+1);
        }
        else{
            num++;
            arr[arr.length-1] = num;
        }
        while (st.size() != 0) {
            num++;
            arr[st2.peek()] = num;
            st.pop();
            st2.pop();
        }


    // BETTER APPROACH
        
        num = 1;
        for(int i = 0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            st2.push(num);
            num++;
            
            if(ch == 'i'){
                while(st2.size()!=0){
                    System.out.print(st2.pop() + " ");
                }
            }
        }
        st2.push(num);
        while(st2.size() !=0){
            System.out.print(st2.pop() + " ");
        }

    }
}
