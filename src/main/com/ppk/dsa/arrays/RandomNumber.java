package com.ppk.dsa.arrays;

/**
 *
 * Array has numbers in sequence except one.
 * Find the index of the number which is not in sequence.
 * e.g: [1,2,3,4,5,6,76,7,8]
 * return 6
 *
 * time complexity o(n)
 */
public class RandomNumber {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,76,7,8};
        int index=findOutOfSeqnum(arr);
        System.out.println("Out of seq index is "+index);
    }

    /**
     * Current value should be previous value +1 to be in sequence
     * @param arr
     * @return
     */
    private static int findOutOfSeqnum(int[] arr) {
        for (int i = 1; i< arr.length; i++){
            if(arr[i]!=arr[i-1]+1) return i;
        }
        return -1;
    }
}
