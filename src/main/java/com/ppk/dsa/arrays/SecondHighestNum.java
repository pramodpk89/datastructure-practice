package com.ppk.dsa.arrays;

/**
 * Given an unsorted array , find out the second largest number without sorting.
 */
public class SecondHighestNum {
    public static void main(String[] args) {
        int[] arr=new int[]{3,8,1,4,2,5,87,3,77,78};
        int secHigh=findSecondHigh(arr);
        System.out.println("Second highest is "+secHigh);
    }

    /**
     * @param arr
     * @return
     */
    private static int findSecondHigh(int[] arr) {
        int sec=-1;int high=-1;
        if(arr[0]>arr[1]){
            high=arr[0];
            sec=arr[1];
        }else{
            high=arr[1];
            sec=arr[0];
        }
        for(int i=2;i< arr.length;i++){
            if(arr[i]>sec){
                if(arr[i]>high) {
                    sec=high;
                    high=arr[i];
                }
                else{
                    sec=arr[i];
                }
            }
        }
        return sec;
    }
}
