package com.ppk.dsa.linklist;

/**
 * Remove duplicates from a singly linked list
 * O(n) time | O(1) space
 */
public class RemoveDuplicates {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    //Solution
    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList curr=linkedList;
        int highest=curr.value;
        while(curr.next!=null){
            if(curr.next.value<=highest)curr.next=curr.next.next;
            else {curr=curr.next;
                highest=curr.value;
            }
        }
        return linkedList;
    }
}
