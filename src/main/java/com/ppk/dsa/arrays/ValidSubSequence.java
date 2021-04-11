package com.ppk.dsa.arrays;

import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ValidSubSequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int j=0;
        for(int i=0;i<array.size();i++){
            if(j==sequence.size()) return true;
            if(array.get(i)==sequence.get(j))
            {
                j=j+1;
            }
        }
        return false;
    }

        @Test
        public void TestCase1() {
            var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
            var sequence = Arrays.asList(22, 25, 6);
            Assertions.assertEquals(true, ValidSubSequence.isValidSubsequence(array, sequence));
        }
}
