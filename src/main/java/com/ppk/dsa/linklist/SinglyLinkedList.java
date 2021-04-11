package com.ppk.dsa.linklist;

public class SinglyLinkedList {
    Node head;
    public SinglyLinkedList(int data){
        head=new Node(data);
    }

    void append(int data){
        Node curr=head;
        while(curr.next!=null) curr=curr.next;
        Node last=new Node(data);
        curr.next=last;
    }

    void printAll(){
        Node curr=head;
        while(curr.next!=null){
            System.out.println("Node >> "+curr.value);
            curr=curr.next;
        }
        System.out.println("Tail >> "+curr.value);
    }

    void remove(int data){
        Node curr=head;
        while(curr.next!=null){
            if(curr.next.value==data) curr.next=curr.next.next;
            curr=curr.next;
        }
    }
}

class Node{
    int value;
    Node next;
    public Node(int value){
        this.value=value;
    }
}