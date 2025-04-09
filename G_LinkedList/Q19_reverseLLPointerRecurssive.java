package G_LinkedList;

// Solved on LEETCODE 
// https://leetcode.com/problems/reverse-linked-list/
public class Q19_reverseLLPointerRecurssive {
    public class ListNode {
        ListNode next;
        int val;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        // Recursive approach
        if(head == null || head.next == null){
            return head;
        }

        ListNode newhead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;

        // Iterative approach
        /* ListNode node = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
        */
    }
}
