package com.ppk.dsa.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * move the characters of the string by key
 * e.g: input "xyz" , key 2
 * output "zab"
 */
public class CaesorCipherEncryptor {
//time complexity O(N) | O(N) space complexity
    public static String caesarCypherEncryptor(String str, int key) {
        if(key>26){
            key=key%26;
        }
        char[] chars=str.toCharArray();
        char[] res=new char[chars.length];
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if(c+key<=122){
                res[i]= (char) ( c+key);
            }
            else{
                c=(char)((c+key)%122+96);
                res[i]=c;
            }
        }
        return String.valueOf(res);
    }

    @Test
    public void Test1(){
        String input="xyz";int key=2;
        String result=CaesorCipherEncryptor.caesarCypherEncryptor(input,key);
        Assertions.assertEquals("zab",result);
    }
}
