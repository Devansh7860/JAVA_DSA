package F_StacksQueues;
import java.util.*;

public class Q11_infixConversion {

    // Convert infix expresion into postfix and prefix
    // infix = a+b*c
    // prefix = +a*bc
    // postfix = abc*+

    public static void operation(Stack<String> pre , Stack<String> post ,  Character oper){
            String preval2 = pre.pop();
            String preval1 = pre.pop();
            String preres = oper + preval1 + preval2;
            pre.push(preres);

            String postval2 =  post.pop();
            String postval1 =  post.pop();
            String postres = postval1 + postval2 + oper;
            post.push(postres);
    }


    public static int precedence(char opr) {
        if (opr == '+' || opr == '-') {
            return 1;
        } else if (opr == '*' || opr == '/') {
            return 2;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> opr = new Stack<>();

        String exp = "4+(3-2*8+9)/2*6";

        for(int i = 0; i<exp.length(); i++){
            Character ch = exp.charAt(i);
            if(ch == '('){
                opr.push(ch);
            }
            else if(Character.isDigit(ch)){
                pre.push(ch + "");
                post.push(ch + "");

            }
            else if(ch == ')'){
                while(opr.peek() != '('){
                    Character oper = opr.pop();
                    operation(pre , post ,  oper);
                }
                opr.pop();

            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(opr.size() != 0 && opr.peek() != '(' && precedence(ch) <= precedence(opr.peek())){
                    Character oper = opr.pop();
                    operation(pre , post ,  oper);
                }
                opr.push(ch);
            }

        }

        while(opr.size() != 0){
            Character oper = opr.pop();
            operation(pre , post ,  oper);
        }

        System.out.println(pre);
        System.out.println(post);
       

    }
    
}
