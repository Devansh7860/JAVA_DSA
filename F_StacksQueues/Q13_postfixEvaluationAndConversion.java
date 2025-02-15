package F_StacksQueues;
import java.util.*;;

public class Q13_postfixEvaluationAndConversion {
    // Evaluate postfix expression
    // Convert postfix into infix and prefix 

    public static int operation(int v1, int v2, char opr) {

        if (opr == '+') {
            return v1 + v2;
        } else if (opr == '-') {
            return v1 - v2;
        } else if (opr == '*') {
            return v1 * v2;
        } else if (opr == '/') {
            return v1 / v2;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        String exp = "264*8/+3-";
        Stack<Integer> eval = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for(int i = 0; i<exp.length(); i++){
            Character ch = exp.charAt(i);
            if(Character.isDigit(ch)){
                eval.push(ch - '0');
                infix.push(ch + "");
                prefix.push(ch + "");
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
                int val2 = eval.pop();
                int val1 = eval.pop();
                int res = operation(val1 , val2 , ch);
                eval.push(res);

                String iv2 = infix.pop();
                String iv1 = infix.pop();
                String ires = '(' + iv1 + ch + iv2 + ')';
                infix.push(ires);

                String pv2 = prefix.pop();
                String pv1 = prefix.pop();
                String pres = ch + pv1 + pv2 ;
                prefix.push(pres);
            }
        }

        System.out.println("Postfix Evaluation " + eval.peek());
        System.out.println("Infix Exp " + infix.peek());
        System.out.println("Prefix Exp " + prefix.peek());
        
    }
}
