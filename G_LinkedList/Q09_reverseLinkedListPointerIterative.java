package G_LinkedList;

public class Q09_reverseLinkedListPointerIterative {
    // Reverse the linkedlist using pointer iterative 
    // i.e head will now become the tail and tail will now become the head and so on...

    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;


        public void reversePI(){
            Node pre = null;
            Node curr = head;
            for(int i = 0; i<size-1; i++){
                Node savenext = curr.next;
                curr.next = pre;
                pre = curr;
                curr = savenext;
            }    
            Node temp = head;
            head = tail;
            tail = temp;
        }

    }
    
}
