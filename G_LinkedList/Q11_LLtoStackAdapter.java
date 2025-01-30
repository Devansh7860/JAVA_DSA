package G_LinkedList;
import java.util.*;

public class Q11_LLtoStackAdapter {
    // We have to give stack properties to a linkedlist using its own functions

    public class LLtoStackAdapter{

        LinkedList<Integer> list;
        public LLtoStackAdapter(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size(); 
        }
        void push(int val){
            list.addFirst(val); 
        }
        int pop(){
            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                return list.removeFirst();
            }
        }
        int top(){

            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                return list.getFirst();
            }

        }
        
        
    }




    public static void main(String[] args) {
        
    }
    
}
