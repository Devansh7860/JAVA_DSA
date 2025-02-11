package F_StacksQueues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Q23_queueToStackAdapterPushEff {
    // Covert queue to stack
    // Push efficient means push function should be in O(1) tc and rest can be in O(N)

    public class queueToStackAdapterPushEff{
        Queue<Integer> mainq;
        Queue<Integer> helperq;

        public queueToStackAdapterPushEff() {
            mainq = new ArrayDeque<>();
            helperq = new ArrayDeque<>();
        }

        int pop(){
            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                while(mainq.size() > 1){
                    helperq.add(mainq.remove());
                }
                int elem = mainq.remove();
                while(helperq.size() != 0){
                    mainq.add(helperq.remove());
                }
                return elem;

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
                while(mainq.size() > 1){
                    helperq.add(mainq.remove());
                }
                int elem = mainq.remove();
                helperq.add(elem);
                while(helperq.size() != 0){
                    mainq.add(helperq.remove());
                }
                return elem;

            }
        }
        void push(int val){
            mainq.add(val);
        }
    }
}
