package G_LinkedList;

public class Q04_getValue {
    // Write 3 functions 
    // getFirst = prints data of first node
    // getLast = prints data of last note
    // getAt = prints data of node at specified index

    
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

        public int getFirst(){
            if(size == 0){
                System.out.println("Empty List");
                return -1;
            } else{
                return head.data;
            }
        }
        public int getLast(){
            if(size == 0){
                System.out.println("Empty List");
                return -1;
            } else{
                return tail.data;
            }
        }
        public int getAt(int index){
            if(index>=size || index < 0){
                System.out.println("Index out of range");
                return -1;
            }
            else if(size == 0){
                System.out.println("Empty List");
                return -1;
            }
            else{
                Node temp = head;
                for(int i = 0;i<index; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
            
            
        }
    }

    public static void main(String[] args) {
        
    }
    
}
