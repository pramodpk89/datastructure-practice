package com.ppk.dsa.linklist;

import java.util.HashSet;
import java.util.Set;

/**
 * Find loop and return the node which is the start of the loop
 * O(N) time | O(1) space
 */
public class FindLoop {
    public static LinkedList findLoop(LinkedList head) {
        Set<LinkedList> set = new HashSet<>();
        LinkedList curr = head;
        while (!set.contains(curr)) {
            set.add(curr);
            curr = curr.next;
        }
        return curr;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

}
