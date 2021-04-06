package com.ppk.dsa.strings;

import com.ppk.dsa.arrays.TwoNumberSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given 2 strings, character and a document string , write a function which can determine
 * if you can generate a document with characters.
 */
public class GenerateDocument {
    public boolean generateDocument(String characters, String document) {
        char[] docs=document.toCharArray();
        for(int i=0;i<docs.length;i++){
            char c=docs[i];
            int countChars=getCharacterCount(characters,c);
            int docChars=getCharacterCount(document,c);
            if(countChars<docChars) return false;
        }
        return true;
    }

    int getCharacterCount(String characters,char c){
        int count=0;
        for(int i=0;i<characters.toCharArray().length;i++){
            if(c==characters.charAt(i)) count=count+1;
        }
        return count;
    }


    @Test
    public void TestCase1() {
        boolean isPossible = this.generateDocument("A","a");
        Assertions.assertFalse(isPossible);
    }

    @Test
    public void TestCase2() {
        boolean isPossible = this.generateDocument("pr a mdoP9819k","pramod");
        Assertions.assertTrue(isPossible);
    }
}
