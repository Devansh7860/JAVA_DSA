package G_LinkedList;

public class Q14_middleOfLL {
    // Find the middle element of a linkedlist 
    // Don't use size property 
    // Use iterative approach in 1 single traversal

    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

       public int mid(){
        Node s = head;
        Node f = head;

        while(f.next.next != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }

        return s.data;
       }

    }
}
