package com.ppk.dsa.strings;

import java.util.Arrays;

/**
 * Given 2 strings s1 and s2, find out the length of longest common word.
 * <p>
 * Time complexity : O(n2) in worst case Best case : O(1)
 */
public class LongestCommonWord {

  public static void main(String[] args) {
    String s1 = "I am a developer";
    String s2 = "I am a java and J2EE developer";

    int longest = findLongestCommon(s1, s2);
    System.out.println("Longest length is " + longest);
  }

  /**
   * Convert the strings to arrays and sort one of them. Start checking for common string from
   * reverse.
   *
   * @param s1
   * @param s2
   * @return
   */
  private static int findLongestCommon(String s1, String s2) {
    String[] s1Arr = s1.split(" ");
    String[] s2Arr = s2.split(" ");
    Arrays.sort(s1Arr);
    for (int outerIdx = s1Arr.length - 1; outerIdx >= 0; outerIdx--) {
      String s1Str = s1Arr[outerIdx];
      boolean containsVal = doesArrayContainsString(s1Str, s2Arr);
      return s1Str.length();
    }
    return -1;
  }

  private static boolean doesArrayContainsString(String s1Str, String[] s2Arr) {
    for (int i = 0; i < s2Arr.length; i++) {
      if (s1Str.contentEquals(s2Arr[i])) {
        return true;
      }
    }
    return false;
  }
}
