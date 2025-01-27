package G_LinkedList;

public class Q07_removeLast {

    public class Node{
        int data;
        Node next;
    }
    public class LinkedList{
        Node head;
        Node tail;
        int size;

        public void removeLast(){
            Node temp = head;
            if(size == 0){
                System.out.println("Empty List");
            }
            else if(size == 1){
                head = temp = null;
                size--;
            }
            else{
                for(int i = 0 ; i<size-2; i++){
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;

            }


            
        }

    }
    public static void main(String[] args) {
        
    }
}
