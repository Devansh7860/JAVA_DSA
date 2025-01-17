package F_StacksQueues;

import java.util.Stack;

public class Q02_balancedBrackets {
    // check if balanced i.e equal no. of opening and closing brackets and no mismatched brackets
    // () , [] , {} 

    public static void func(Stack<Character> st , char ch) {
        
    }

    public static void checkBrackets(String str){

        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')'){
                func(st , '(');
            }
            else if(ch == ']'){
                func(st , '[');
            }
            else if(ch == '}'){
                func(st, '{');
            }
        }

    }

    public static void main(String[] args) {
        String str1 = "{[(a+b)+(b-c)] + (a-c)}";
        String str2 = "{[(x+y) + {z-c})}";
        checkBrackets(str1);
        checkBrackets(str2);
    }
    
}
