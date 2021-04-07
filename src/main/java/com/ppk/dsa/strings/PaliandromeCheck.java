package com.ppk.dsa.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Check if a string is a paliandrome
 * Optimal time complexity : O(N) time and O(1) space
 */
public class PaliandromeCheck {
    public boolean isPalindrome(String str) {
        char[] chars=str.toCharArray();
        int j=chars.length-1;
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=chars[j]) return false;
            j--;
        }
        return true;
    }

    @Test
    public void Test1(){
        String str="abcba";
        boolean res=new PaliandromeCheck().isPalindrome(str);
        Assertions.assertTrue(res);
    }
}
