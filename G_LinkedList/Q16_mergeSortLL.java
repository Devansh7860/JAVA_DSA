package G_LinkedList;

import G_LinkedList.Q02_displayAndSize.LinkedList;
import G_LinkedList.Q02_displayAndSize.Node;

public class Q16_mergeSortLL {
    // sort a list using merge sort algorithm

    public static LinkedList mergeSort(Node head , Node tail){
        Q02_displayAndSize outer = new Q02_displayAndSize();

        if(head == tail){
            LinkedList br = outer.new LinkedList();
            br.addLast(head.data);
            return br;
        }
        Node mid = midNode(head, tail); 
        LinkedList fsh = mergeSort(head, mid);
        LinkedList ssh = mergeSort(mid.next, tail);
        LinkedList cl = Q15_merge2SortedLL.merge2SortedLL(fsh, ssh);
        return cl;
    }

    public static Node midNode(Node head , Node tail){
        Node s = head;
        Node f = head;
        while(f != tail && f.next != tail){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    
    public static void main(String[] args) {
        Q02_displayAndSize outer = new Q02_displayAndSize();
        LinkedList l1 = outer.new LinkedList();
        l1.addLast(2);
        l1.addLast(8);
        l1.addLast(1);
        l1.addLast(7);
        l1.addLast(4);
        l1.addLast(6);
        l1.addLast(5);
        l1.addLast(3);
        LinkedList res = mergeSort(l1.head, l1.tail);
        Node temp = res.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
