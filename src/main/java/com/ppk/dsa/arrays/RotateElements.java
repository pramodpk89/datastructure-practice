package com.ppk.dsa.arrays;

/**
 * Rotate elements from right to left k times
 */
public class RotateElements {

   static int[] leftShift(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }

    static int[] rotateLeft(int[] arr,int k){
       for(int i=1;i<=k;i++) arr=leftShift(arr);
       return arr;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{0,1,2,3,4,5};
        arr=rotateLeft(arr,4);
        System.out.println(arr);
    }
}
