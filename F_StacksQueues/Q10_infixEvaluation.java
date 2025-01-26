package F_StacksQueues;

import java.util.Stack;

public class Q10_infixEvaluation {

    // infix expression : a*b+c/d*(f+g)
    // all digits are single
    // + - precedence < * /
    // brackets can be used to impact precedence of operations
    // if same precedence operators , then one on left will be evaluated first.

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

        return 0;
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
        String exp = "3+(4-2*9/3)";
        Stack<Integer> oprnds = new Stack<>();
        Stack<Character> optor = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                optor.push(ch);
            } else if (Character.isDigit(ch)) {
                oprnds.push(ch - '0'); // CONVERTING CHARACTER INTO INTEGER
            } else if (ch == ')') {
                while (optor.peek() != '(') {
                    char opr = optor.pop();
                    int val2 = oprnds.pop();
                    int val1 = oprnds.pop();

                    int opv = operation(val1, val2, opr);
                    oprnds.push(opv);

                }
                optor.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (optor.size() > 0 && optor.peek() != '(' && precedence(ch) <= precedence(optor.peek())) {
                    char opr = optor.pop();
                    int val2 = oprnds.pop();
                    int val1 = oprnds.pop();

                    int opv = operation(val1, val2, opr);
                    oprnds.push(opv);
                }
                optor.push(ch); 
            }
        }

        while (optor.size() != 0) {
            char opr = optor.pop();
            int val2 = oprnds.pop();
            int val1 = oprnds.pop();

            int opv = operation(val1, val2, opr);
            oprnds.push(opv);

        }

        System.out.println(oprnds.peek());
    }
}
