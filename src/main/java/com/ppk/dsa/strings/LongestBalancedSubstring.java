package com.ppk.dsa.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * given a string containing only parenthesis ( and ) , find the length of longest balanced substring.
 * e.g: (()(() , result is 2
 *
 * optimal time complexity is O(n) time | O(1) space
 */
public class LongestBalancedSubstring {
    public int longestBalancedSubstring(String string) {
        char[] chars=string.toCharArray();
        int open=0,close=0,max=0,curr=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('){
                open +=1;
            }
            else close +=1;
            if(open==close){
                max=Math.max(max,close*2);
            }else if(close>open){
                open=0;close=0;
            }
        }


        open=0;close=0;
        for(int i=chars.length-1;i>=0;i--){

            if(chars[i]=='('){
                open +=1;
            }
            else close +=1;
            if(open==close){
                max=Math.max(max,open*2);
            }else if(open>close){
                open=0;close=0;
            }
        }

        return max;
    }

    @Test
    public void test1(){
        String input="(()(()";
        int actual=this.longestBalancedSubstring(input);
        Assertions.assertEquals(2,actual);
    }
}
