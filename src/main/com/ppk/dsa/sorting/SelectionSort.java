package com.ppk.dsa.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(selectionSort(new int[]{5,1,9,44,32,0}));
    }
    public static int[] selectionSort(int[] array) {
        for(int i=0;i<array.length;i++){
            int minIdx=i;
            for(int j=i+1;j<array.length;j++){
                if(array[minIdx]>array[j]) minIdx=j;
            }

            if(array[minIdx]<array[i]) {
                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
            }
        }
        return array;
    }
}
