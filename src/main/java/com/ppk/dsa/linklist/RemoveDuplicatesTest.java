package com.ppk.dsa.linklist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test class for RemoveDuplicates [Remove duplicates from singly linked list]
 */
public class RemoveDuplicatesTest {
    public RemoveDuplicates.LinkedList addMany(RemoveDuplicates.LinkedList ll, List<Integer> values) {
        RemoveDuplicates.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new RemoveDuplicates.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(RemoveDuplicates.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        RemoveDuplicates.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void TestCase1() {
        RemoveDuplicates.LinkedList input = new RemoveDuplicates.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        RemoveDuplicates.LinkedList output = new RemoveDuplicates().removeDuplicatesFromLinkedList(input);
        Assertions.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
}
