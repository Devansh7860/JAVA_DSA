package G_LinkedList;

import G_LinkedList.Q02_displayAndSize.LinkedList;
import G_LinkedList.Q02_displayAndSize.Node;

public class Q16_mergeSortLL {
    // sort a list using merge sort algorithm
    // tc = n(logn)

    public static Node mergeSort(Node head){

        if(head == null || head.next == null){
            return head;
        }
        Node mid = midNode(head); 
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        Node fsh = mergeSort(left);
        Node ssh = mergeSort(right);
        Node cl = Q15_merge2SortedLL.merge2SortedLL(fsh, ssh);
        return cl;
    }

    public static Node midNode(Node head){
        Node s = head;
        Node f = head;
        while(f.next != null && f.next.next != null){
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
        Node res = mergeSort(l1.head);
        while(res.next != null){
            System.out.print(res.data + " ");
            res = res.next;
        }


    }
}
