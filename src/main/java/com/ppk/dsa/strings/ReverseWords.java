package com.ppk.dsa.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Reverse the words in string
 * e.g: input "I am you";
 * output "you am I"
 */
public class ReverseWords {
    public String reverseWordsInString(String string) {
        List<String> words=new ArrayList<String>();
        int startOfWord=0;
        for(int i=0;i<string.length();i++){
            char c=string.charAt(i);
            if(c==' '){
                words.add(string.substring(startOfWord,i));
                startOfWord=i;
            }
            else if(string.charAt(startOfWord)==' '){
                words.add(string.substring(startOfWord,i));
                startOfWord=i;
            }
        }
        words.add(string.substring(startOfWord));
        Collections.reverse(words);
        return String.join("",words);
    }

    @Test
    public void Test1(){
        String input = "I  am you!";
        String expected = "you! am  I";
        String actual = new ReverseWords().reverseWordsInString(input);
        Assertions.assertTrue(expected.equals(actual));
    }
}
