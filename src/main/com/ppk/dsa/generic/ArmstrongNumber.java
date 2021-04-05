package com.ppk.dsa.generic;

/**
 * A number is an armstrong number if sum of cubes of its digit is equal to the number
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrongNumCheck("153"));
    }

    private static boolean armstrongNumCheck(String str) {
        String[] chars = str.split("");
        int runningSum = 0;
        for (String i : chars) {
            int val = Integer.valueOf(i);
            runningSum = runningSum + (val * val * val);
        }
        return (runningSum == Integer.valueOf(str));
    }
}
