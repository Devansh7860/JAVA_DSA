package G_LinkedList;

public class Q08_reverseLinkedListDataIterative {

    // Reverse the data values of linkedlist
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;


        private Node getNodeAt(int ind){
            Node temp = head;
            for(int i = 0; i<ind; i++){
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI(){
            int i = 0;
            int j = size-1;
            while(i<j){
                Node left = getNodeAt(i);
                Node right = getNodeAt(j);
                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                i++;
                j--;
            }

        }

    }
}
