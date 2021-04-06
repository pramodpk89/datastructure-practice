package com.ppk.dsa.arrays;

import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

/**
 * write a function that takes 2 non-empty array of distinct integers and integer representing target sum.
 * If any 2 numbers add up to target sum then function should return that in the result.
 */
    public class TwoNumberSum {
// O(n) time ans space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<array.length;i++){
            int diff=targetSum-array[i];
            if(set.contains(diff)) return new int[]{array[i],diff};
            else set.add(array[i]);
        }
        return new int[0];
    }
    @Test
    public void TestCase1() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, -1));
        Assertions.assertTrue(contains(output, 11));
    }

    public boolean contains(int[] output, int val) {
        for (var el : output) {
            if (el == val) return true;
        }
        return false;
    }
}
