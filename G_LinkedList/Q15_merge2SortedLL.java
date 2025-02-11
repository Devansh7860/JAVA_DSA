package G_LinkedList;

import G_LinkedList.Q02_displayAndSize.LinkedList;
import G_LinkedList.Q02_displayAndSize.Node;

public class Q15_merge2SortedLL {
    // merge 2 sorted list


    public static LinkedList merge2SortedLL(LinkedList l1 , LinkedList l2){
        Q02_displayAndSize outer = new Q02_displayAndSize();
        LinkedList res = outer.new LinkedList();
        Node one = l1.head;
        Node two = l2.head;

        while(one != null && two != null){
            if(one.data < two.data){
                res.addLast(one.data);
                one = one.next;
            }
            else if(one.data == two.data){
                res.addLast(one.data);
                res.addLast(two.data);
                one = one.next;
                two = two.next;
            }
            else{
                res.addLast(two.data);
                two = two.next;
            }
        }

        while(one != null){
            res.addLast(one.data);
            one = one.next;
        }
        while(two != null){
            res.addLast(two.data);
            two = two.next;
        }

        return res;

    }

    public static void main(String[] args) {


    }
}
