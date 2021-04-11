package com.ppk.dsa.linklist;

public class LinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.printAll();

        list.remove(2);
        list.printAll();
    }
}
