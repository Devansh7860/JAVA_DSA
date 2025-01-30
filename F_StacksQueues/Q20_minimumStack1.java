package F_StacksQueues;

import java.util.*;

public class Q20_minimumStack1 {
    // Create a function min which returns the minimum value in the stack apart from pop,top,push,size
    // There is no space constraint.

    public class minStack1 {
        Stack<Integer> data;
        Stack<Integer> minStack;

        public minStack1() {
            data = new Stack<>();
            minStack = new Stack<>();
        }

        void push(int val) {
            data.push(val);
            if (minStack.size() == 0 || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        int size() {
            return data.size();
        }

        int pop() {
            if (data.size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                if (data.peek() == minStack.peek()) {
                    minStack.pop();
                }
                return data.pop();
            }

        }

        int min() {
            if (data.size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return minStack.peek();
            }
        }
    }

}
