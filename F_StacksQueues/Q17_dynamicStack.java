package F_StacksQueues;

import java.util.*;

public class Q17_dynamicStack {
    // We are creating a dynamic stack on our own using arrays
    // basically in previous question if array gets filled up then push function
    // retunrs "Stack Overflow"
    // so here we will try to solve that

    public class customStack {
        int[] data;
        int tos; // top of stack

        customStack(int n) {
            this.data = new int[n];
            this.tos = -1;
        }

        int size() {
            return tos + 1;
        }

        void display() {
            for (int i = tos; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        int top() {
            if (tos == -1) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return data[tos];
            }
        }

        int pop() {
            if (tos == -1) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int val = data[tos];
                tos--;
                return val;
            }
        }

        void push(int val) {
            if (tos == data.length - 1) {
                int[] newData = Arrays.copyOf(data, data.length * 2);
                data = newData;
                tos++;
                data[tos] = val;

            } else {
                tos++;
                data[tos] = val;
            }
        }

    }

    public static void main(String[] args) {
        Q17_dynamicStack outer = new Q17_dynamicStack();
        customStack st = outer.new customStack(3);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.top());
        st.push(4);
        st.display();
        System.out.println(st.size());
    }
    
}
