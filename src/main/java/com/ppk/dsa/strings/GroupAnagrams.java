package com.ppk.dsa.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 2 words are said to be an anagram when their contents are same.
 * sample input: ["abc", "dabd", "bca", "cab", "ddba"]
 * expectedOutput: [[abc, bca, cab], [dabd, ddba]]
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> words) {
        List<List<String>> res = new ArrayList<>();
        List<Integer> usedIndices = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (!usedIndices.contains(i)) {
                String str = words.get(i);
                List<String> list = new ArrayList<String>();
                list.add(str);
                usedIndices.add(i);
                for (int j = i + 1; j < words.size(); j++) {
                    String str2 = words.get(j);
                    boolean same = areTheySame(str, str2);
                    if (same) {
                        list.add(str2);
                        usedIndices.add(j);
                    }
                }
                res.add(list);
            }
        }
        return res;
    }

    static boolean areTheySame(String str, String str2) {
        if (str.length() != str2.length()) return false;
        char[] chars1 = str.toCharArray();
        Arrays.sort(chars1);
        str = String.valueOf(chars1);

        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);
        str2 = String.valueOf(chars2);
        return str.contentEquals(str2);
    }

    @Test
    public void testCase1(){
        List<String> words =
                new ArrayList<String>(
                        Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("yo", "oy")));
        expected.add(new ArrayList<String>(Arrays.asList("flop", "olfp")));
        expected.add(new ArrayList<String>(Arrays.asList("act", "tac", "cat")));
        expected.add(new ArrayList<String>(Arrays.asList("foo")));
        List<List<String>> output = this.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        Assertions.assertTrue(compare(expected, output));
    }
    public boolean compare(List<List<String>> expected, List<List<String>> output) {
        if (expected.size() != output.size()) return false;

        for (List<String> group : expected) {
            Collections.sort(group);
            if (!output.contains(group)) return false;
        }

        return true;
    }
}
