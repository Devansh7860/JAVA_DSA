package G_LinkedList;


import java.util.LinkedList;

public class Q12_LLtoQueueAdapter {
    // We have to give queue properties to a Linkedlist using its own functions 

    public class LLtoQueueAdapter{
        LinkedList<Integer> list;

        public LLtoQueueAdapter(){
            list = new LinkedList<>();
        }
        int size(){
            return list.size();
        }
        void add(int val){
            list.addLast(val);
        }
        int remove(){
            if(size() == 0){
                System.out.println("Queue Underflow");
                return -1;
            }
            else{
                return list.removeFirst();
            }
        }
        int peek(){
            if(size() == 0){
                System.out.println("Queue Underflow");
                return -1;
            }
            else{
                return list.getFirst();
            }
        }

    }
}
