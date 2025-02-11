package G_LinkedList;

import G_LinkedList.Q17_removeDuplicatesInSortedLL.ListNode;

// SOLVED ON LEETCODE
public class Q18_oddEvenLL {
    // Print odd position elements first then even
    // eg. ll = 2-4-5-9-0-8
    // Output = 2-5-0-4-9-8


    public ListNode oddEvenList(ListNode head) {

        if (head != null) {
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenhead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                odd = odd.next;
                even.next = even.next.next;
                even = even.next;
            }
            odd.next = evenhead;
        }

        return head;
    }
}

