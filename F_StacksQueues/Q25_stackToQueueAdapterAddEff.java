package F_StacksQueues;
import java.util.*;

public class Q25_stackToQueueAdapterAddEff {
    // Covert stack to queue
    // Add efficient means add function should be in O(1) tc and rest can
    // be in O(N)
    public class stackToQueueAdapterAddEff{
        Stack<Integer> mainst;
        Stack<Integer> helperst;

        public stackToQueueAdapterAddEff(){
            mainst = new Stack<>();
            helperst = new Stack<>();
        }
        void push(int val){
            mainst.push(val);
        }
        int size(){
            return mainst.size();
        }
        int peek(){
            if(mainst.size() == 0){
                System.out.println("Queue underflow");
                return -1;
            }
            else{
                while(mainst.size() > 1){
                    helperst.push(mainst.pop());
                }
                int elem = mainst.pop();
                helperst.push(elem);
                while(helperst.size() != 0){
                    mainst.push(helperst.pop());
                }
                return elem;
            }
        }
        int remove(){
            if(mainst.size() == 0){
                System.out.println("Queue underflow");
                return -1;
            }
            else{
                while(mainst.size() > 1){
                    helperst.push(mainst.pop());
                }
                int elem = mainst.pop();
                while(helperst.size() != 0){
                    mainst.push(helperst.pop());
                }
                return elem;
            }
        }

    }
}
