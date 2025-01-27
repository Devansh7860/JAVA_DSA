package G_LinkedList;

public class Q10_removeAtIndex {

    public class Node {
        int data;
        Node next;
    }

    public class LinkedList {
        Node head;
        Node tail;
        int size;

        public void removeFirst() {
            head = head.next;
            size--;
        }

        public void removeLast() {
            Node temp = head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;

        }

        public void removeAt(int ind) {
            if (ind < 0 || ind >= size) {
                System.out.println("Index out of range");
                return;
            }

            Node temp = head;
            if (size == 0) {
                System.out.println("Empty List");
            } else if (size == 1) {
                head = temp = null;
                size--;
            } else {
                if (ind == 0) {
                    removeFirst();
                } else if (ind == size - 1) {
                    removeLast();
                } else {
                    for (int i = 0; i < ind - 1; i++) {
                        temp = temp.next;
                    }
                    temp.next = temp.next.next;
                    size--;

                }
            }
        }
    }
}
