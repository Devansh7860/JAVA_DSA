package G_LinkedList;

import G_LinkedList.Q02_displayAndSize.Node;

public class Q15_merge2SortedLL {
    // merge 2 sorted list


    public static Node merge2SortedLL(Node head1 , Node head2){

        // BETTER APPROACH WITH CONSTANT SPACE COMPLEXITY

        Q02_displayAndSize outer = new Q02_displayAndSize();
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = outer.new Node();
        dummy.data = -1;
        dummy.next = null;
        Node temp = dummy;

        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 == null){
            temp.next = t2;
        }
        else{
            temp.next = t1;
        }

        return dummy.next;


        // Q02_displayAndSize outer = new Q02_displayAndSize();
        // LinkedList res = outer.new LinkedList();
        // Node one = l1.head;
        // Node two = l2.head;

        // while(one != null && two != null){
        //     if(one.data < two.data){
        //         res.addLast(one.data);
        //         one = one.next;
        //     }
        //     else if(one.data == two.data){
        //         res.addLast(one.data);
        //         res.addLast(two.data);
        //         one = one.next;
        //         two = two.next;
        //     }
        //     else{
        //         res.addLast(two.data);
        //         two = two.next;
        //     }
        // }

        // while(one != null){
        //     res.addLast(one.data);
        //     one = one.next;
        // }
        // while(two != null){
        //     res.addLast(two.data);
        //     two = two.next;
        // }

        // return res;

    }

    public static void main(String[] args) {


    }
}
