package com.ppk.dsa.linklist;

/**
 * remove kth node from the end of the list
 * O(n) time | O(1) space
 */
public class RemoveKthNodeFromList {
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        System.out.println("Head is "+head.value+" >> k is "+k);
        LinkedList init=head;LinkedList last=init;int count=1;
        while(last.next!=null && count<=k){
            last=last.next; count=count+1;
        }
        while(last.next!=null){
            last=last.next;
            init=init.next;
        }
        if(init==head){
            System.out.println("Head is the node to be deleted");
            head=init.next;
            head.next=init.next.next;
        }
        else init.next=init.next.next;
        System.out.println("Head is "+head);
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
