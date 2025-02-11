package F_StacksQueues;

import java.util.Stack;

public class Q24_stackToQueueAdapterRemoveEff {
    // Covert stack to queue
    // Remove efficient means remove and peek functions should be in O(1) tc and rest can
    // be in O(N)

    public class stackToQueueAdapterRemoveEff {
        Stack<Integer> mainst;
        Stack<Integer> helperst; 
        
        public stackToQueueAdapterRemoveEff(){
            mainst = new Stack<>();
            helperst = new Stack<>();
        }

        int remove(){
            if(mainst.size() == 0){
                System.out.println("Queue underflow");
                return -1;
            }
            else{
                return mainst.pop();
            }
        }
        int peek(){
            if(mainst.size() == 0){
                System.out.println("Queue underflow");
                return -1;
            }
            else{
                return mainst.peek();
            }
        }
        int size(){
            return mainst.size();
        }
        void push(int val){
            while(mainst.size() !=0){
                helperst.push(mainst.pop());
            }
            mainst.push(val);
            while(helperst.size() != 0){
                mainst.push(helperst.pop());
            }
        }
        
    }
}
