package G_LinkedList;

// SOLVED ON LEETCODE
public class Q17_removeDuplicatesInSortedLL {
    // Remove duplicates in a sorted linked list

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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode fs = head;

        while (fs != null && fs.next != null) {
            if (fs.val == fs.next.val) {
                fs.next = fs.next.next;
            } else {
                fs = fs.next;
            }
        }
        return head;
    }

}
