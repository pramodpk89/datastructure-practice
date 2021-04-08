package com.ppk.dsa.linklist;

/**
 * Reverse a linkedList
 * O(N) time | O(1) space
 */
public class ReverseLinkedList {
    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList curr=head;
        LinkedList prev=null;
        while(curr!=null){
            LinkedList nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;

        }
        return prev;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
