package F_StacksQueues;

import java.util.Stack;

public class Q02_balancedBrackets {
    // check if balanced i.e equal no. of opening and closing brackets and no mismatched brackets
    // () , [] , {} 

    public static boolean func(Stack<Character> st , char ch) {
        
        if (st.size() == 0) {
            return false;
        }
        else if(st.peek() != ch){
            return false;
        }
        else{
            st.pop();
            return true;
        }

        
    }

    public static void checkBrackets(String str){

        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')'){
                boolean val = func(st , '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch == ']'){
                boolean val = func(st , '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch == '}'){
                boolean val = func(st , '{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if(st.size() == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }

    public static void main(String[] args) {
        String str1 = "{[(a+b)+(b-c)] + (a-c)}";
        String str2 = "{[(x+y) + {z-c})}";
        String str3 = "{[(x+y)}";
        String str4 = "{()}]";
        checkBrackets(str1);
        checkBrackets(str2);
        checkBrackets(str3);
        checkBrackets(str4);

    }
    
}
