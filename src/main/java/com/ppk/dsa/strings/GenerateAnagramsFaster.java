package com.ppk.dsa.strings;

import java.util.*;

/**
 * Another faster way of implementing GroupAnagrams problem
 * TimeComplexity O(w*n*log(n)) time | O(w*n) space
 * w-> no of words
 * n->length of longest word
 * nLog(n) because avg sorting time of Arrays.sort(array) is nlogN
 */
public class GenerateAnagramsFaster {
    public static List<List<String>> groupAnagrams(List<String> words) {
        List<List<String>> result=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<words.size();i++){
            String str=words.get(i);
            String str2=arrange(str);
            if(map.containsKey(str2)){
                List<String> list=map.get(str2);
                list.add(str);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(str2,list);
            }
        }

        Iterator hmIterator = map.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            List<String> list =(List)mapElement.getValue();
            result.add(list);
        }
        return result;
    }

    static String arrange(String str){
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
