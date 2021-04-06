package com.ppk.dsa.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * find index of first non repeating character
 */
public class FIrstNonRepeatingChar {
    //O(n) time and O(1) space
   static public int firstNonRepeatingCharacter(String string) {
        Map<Character,Integer> freqMap=new HashMap<Character,Integer>();
        for(int i=0;i<string.length();i++){
            char c=string.charAt(i);
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        for(int i=0;i<string.length();i++){
            char c=string.charAt(i);
            if(freqMap.get(c)==1) return i;
        }
        return -1;
    }

    @Test
    public void TestCase1() {
        int idx = FIrstNonRepeatingChar.firstNonRepeatingCharacter("abcdac");
        Assertions.assertEquals(1,idx);
    }

    @Test
    public void TestCase2() {
        int idx = FIrstNonRepeatingChar.firstNonRepeatingCharacter("faadabcbbebdf");
        Assertions.assertEquals(6,idx);
    }
}
