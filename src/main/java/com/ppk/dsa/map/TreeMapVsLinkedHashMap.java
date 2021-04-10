package com.ppk.dsa.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap is sorted according to natural ordereing of keys
 * LinkedHashMap is sorted according to order of insertion
 */
public class TreeMapVsLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String > tMap=new TreeMap();
        tMap.put(10,"Sachin");
        tMap.put(7,"Sehwag");
        tMap.put(1,"Ganguly");
        tMap.put(100,"Srinath");
        tMap.put(200,"Prasad");
        System.out.println("TreeMap>> "+tMap);

        Map<Integer,String > lMap=new LinkedHashMap<>();
        lMap.put(10,"Sachin");
        lMap.put(7,"Sehwag");
        lMap.put(1,"Ganguly");
        lMap.put(100,"Srinath");
        lMap.put(200,"Prasad");
        System.out.println("HashMap>> "+lMap);
    }
}
