package com.ppk.dsa.linklist;

public class LinkListTest {

  public static void main(String[] args) {
    SinglyLinkList linkList=new SinglyLinkList(1);
    linkList.append(2);
    linkList.append(3);
    linkList.append(4);
    System.out.println(linkList);
    System.out.println(linkList.size());
    linkList.deleteNode(2);
    System.out.println(linkList);
  }
}
