package com.ppk.dsa.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * encode input string using run length encoding
 * Optimal time O(N) | space O(N)
 */
public class RunLengthEncoding {
    public static String runLengthEncoding(String string) {
        char[] chars = string.toCharArray();
        int count = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < chars.length; i++) {
            char curr = chars[i];
            char prev = chars[i - 1];
            if (prev == curr) {
                if (count <= 9)
                    count = count + 1;
                else {
                    count = 2;
                    sb = sb.append(9).append(prev);
                }
            } else {
                sb = sb.append(count).append(prev);
                count = 1;
            }
            if (i == chars.length - 1) {
                sb = sb.append(count).append(curr);
            }
        }
        return sb.toString();
    }

    @Test
    public void TestCase1(){
        String input="AABBAAAAAAAAAAAA";
        String actual=RunLengthEncoding.runLengthEncoding(input);
        Assertions.assertEquals("2A2B9A3A",actual);
    }
}
