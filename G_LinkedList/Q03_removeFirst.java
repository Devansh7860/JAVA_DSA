package G_LinkedList;

public class Q03_removeFirst {
    // Remove the first element of the linked list

    public class Node{
        int data;
        Node next;
    }

    public class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void removeFirst(){
            if(size == 0){
                System.out.println("List is empty");
            }
            else if(size == 1){
                head = tail = null;
                size--;
            }
            else{
                head = head.next;
                size--;

            }
        }

    }

    public static void main(String[] args) {
        
    }
}
