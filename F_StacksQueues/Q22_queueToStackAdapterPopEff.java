package F_StacksQueues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Q22_queueToStackAdapterPopEff {
    // Covert queue to stack
    // Pop efficient means pop and top functions should be in O(1) tc and rest can
    // be in O(N)

    public class queueToStackAdapterPopEff {
        Queue<Integer> mainq;
        Queue<Integer> helperq;

        public queueToStackAdapterPopEff() {
            mainq = new ArrayDeque<>();
            helperq = new ArrayDeque<>();
        }

        int pop(){
            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                return mainq.remove();
            }
        }
        int size(){
            return mainq.size();
        }
        int top(){
            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                return mainq.peek();
            }
        }
        void push(int val){
            while(mainq.size() != 0){
                helperq.add(mainq.remove());
            }
            mainq.add(val);
            while(helperq.size() != 0){
                mainq.add(helperq.remove());
            }
        }

    }
}
