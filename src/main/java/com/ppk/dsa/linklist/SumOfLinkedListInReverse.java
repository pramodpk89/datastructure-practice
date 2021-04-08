package com.ppk.dsa.linklist;

import java.util.ArrayList;
import java.util.List;

/**
 * SUm the linked list in reverse and return a new list
 * e.g list1:  2->4->7->1      [represents 1742]
 * list2: 9->4->5              [represents 549]
 * return: 1->9->2->2          [represents 2291 = 1742+549]
 */
public class SumOfLinkedListInReverse {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        List<Integer> listOne = new ArrayList<Integer>();
        List<Integer> listTwo = new ArrayList<Integer>();

        listOne = extractNumbers(linkedListOne);
        listTwo = extractNumbers(linkedListTwo);

        String str1 = reverseList(listOne);
        String str2 = reverseList(listTwo);
        int result = Integer.valueOf(str1) + Integer.valueOf(str2);
        int[] arr = reverseAndConvertToArr(result);
        LinkedList linkedList = createNewList(arr);
        return linkedList;
    }

    private LinkedList createNewList(int[] arr) {
        LinkedList head = new LinkedList(arr[0]);
        LinkedList curr = head;
        int i = 1;
        while (i < arr.length) {
            curr.next = new LinkedList(arr[i]);
            curr = curr.next;
            i = i + 1;
        }
        return head;
    }

    List<Integer> extractNumbers(LinkedList linkList) {
        List<Integer> list = new ArrayList<>();
        LinkedList curr = linkList;
        while (curr.next != null) {
            list.add(curr.value);
            curr = curr.next;
        }
        list.add(curr.value);
        return list;
    }

    String reverseList(List<Integer> list) {
        String res = "";
        int[] arr = new int[list.size()];
        int idx = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            arr[idx] = list.get(i);
            res = res + String.valueOf(arr[idx]);
            idx = idx + 1;
        }
        return res;
    }

    int[] reverseAndConvertToArr(int result) {
        String str = String.valueOf(result);
        int[] input = new int[str.length()];
        int j = 0;
        while (result % 10 != 0) {
            input[j] = result % 10;
            j = j + 1;
            result = result / 10;
        }

        return input;
    }
}
