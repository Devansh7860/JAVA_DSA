package G_LinkedList;

public class Q05_addFirst {
    // Add a new node at the first 

    
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public void addFirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            if(size == 0){
                tail = temp;
            }
            head = temp;
            size++;
        }

    }

    public static void main(String[] args) {
        
    }
    

}
