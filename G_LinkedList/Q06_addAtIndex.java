package G_LinkedList;

public class Q06_addAtIndex {
    // Add a new node at a specified index
    
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
        public void addLast(int val){
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
        public void addAtIndex(int ind , int val){
            if(ind == 0){
                addFirst(val);
            }
            else if (ind == size-1){
                addLast(val);
            }
            else if (ind < 0 || ind>=size){
                System.out.println("Index out of reach");
            }
            else{
                Node node = new Node();
                Node temp = head;
                node.data = val;
                for(int i = 0; i<ind-1;i++){
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;

                size++;
            }
        }

    }

    public static void main(String[] args) {
        
    }

}
