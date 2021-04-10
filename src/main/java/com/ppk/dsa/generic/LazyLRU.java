package com.ppk.dsa.generic;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Lazy implementation using LinkedHashMap
 */
public class LazyLRU {
    private int maxSize;
    LinkedHashMap<String,String> cache;
    public LazyLRU(int size){
        cache=new LinkedHashMap(size, 0.75F,true){
            protected boolean removeEldestEntry(Map.Entry eldest){
            return size()>maxSize;
            };
        };
        maxSize=size;
    }

    void insert(String key,String value){
     cache.put(key,value);
    }

    String get(String key){
        return cache.getOrDefault(key,"Does not exist in cache");
    }


}
