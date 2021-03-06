package com.ppk.dsa.generic;

import java.util.*;

class LRUUsingSet {

    Set<Integer> cache;
    int capacity;

    public LRUUsingSet(int capacity)
    {
        this.cache = new LinkedHashSet<Integer>(capacity);
        this.capacity = capacity;
    }

    public boolean isPresent(int key)
    {
        if (!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;
    }

    public void refer(int key)
    {
        if (isPresent(key) == false)
            insert(key);
    }

    public void display()
    {
        LinkedList<Integer> list = new LinkedList<>(cache);
        Iterator<Integer> itr = list.descendingIterator();

        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }

    public void insert(int key)
    {

        if (cache.size() == capacity) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }

        cache.add(key);
    }

    public static void main(String[] args)
    {
        LRUUsingSet ca = new LRUUsingSet(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }
}
