package G_LinkedList;

public class Q13_kthElemFromEnd {
    // We have to print data of kth index from end
    // We can't use size property
    // We have to give an iterative sol. in 1 traversal.

    public class Node{
        int data;
        Node next;
    }
    public class LinkedList{
        Node head;
        Node tail;
        int size;

        int kthfromEnd(int k){
            Node s = head;
            Node f = head;



            if(k<0 || k>size){
                System.out.println("Index out of bound");
                return -1;
            }
            else{
                for(int i = 0; i<k; i++){
                    f = f.next;
                }
                while(f.next != null){
                    f = f.next;
                    s = s.next;
                }
            }
            
            return s.data;

        }


    }

    public static void main(String[] args) {
        
    }
}
