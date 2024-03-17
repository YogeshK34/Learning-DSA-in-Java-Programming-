package com.sort.bubbleSort;

import java.util.Arrays;
public class FirstProgram {
    public static void main(String[] args) {
        int [] arr = {3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr){
        boolean swapped;
        //first loop or (i)th loop
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //now the (j)th loop
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    //then swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}