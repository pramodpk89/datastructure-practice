package com.ppk.dsa.linklist;

/**
 * shift linked list by k places. if k is positive then shift right else shift left.
 *
 * This code has O(kN) time and O(1) space
 *
 */
public class ShiftLinkedList {
    public static LinkedList shiftLinkedList(LinkedList head, int k) {
        if (k > 0) {
            for (int i = 0; i < k; i++) {
                head = shiftOnceRight(head);
            }
        } else if (k < 0) {
            k = Math.abs(k);
            for (int i = 0; i < k; i++) {
                head = shiftOnceLeft(head);
            }
        }
        return head;
    }

    static LinkedList shiftOnceRight(LinkedList head) {
        LinkedList curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        LinkedList newHead = new LinkedList(curr.next.value);
        newHead.next = head;
        curr.next = null;
        return newHead;
    }

    static LinkedList shiftOnceLeft(LinkedList head) {
        // 0->1->2->3->4->5
        // 1->2->3->4->5->0
        LinkedList oldHead = head;
        LinkedList newHead = head.next;
        LinkedList curr = oldHead;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = oldHead;
        curr.next.next = null;
        return newHead;
    }

    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            next = null;
        }
    }
}
