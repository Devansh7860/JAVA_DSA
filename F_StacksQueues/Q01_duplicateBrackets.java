package F_StacksQueues;
import java.util.*;

public class Q01_duplicateBrackets {
    
    // find whether the input string expression has duplicate brackets or not
    // eg. ((a+b) + (c+d)) has no duplicate brackets
    // eg. (a+b) +((c+d)) has duplicate brackets

    public static void checkDuplicateBrackets(String a) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) != ')'){
                st.push(a.charAt(i));
            }
            else{
                if(st.peek() == '('){
                    System.out.println("Duplicate Brackets detected");
                    return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        System.out.println("No Duplicate brackets detected");
    }


    public static void main(String[] args) {

        String str1 = "(a+b) + ((c+d))";
        String str2 = "((a+b) + (c+d))";

        checkDuplicateBrackets(str1);
        checkDuplicateBrackets(str2);

        
    }
}
