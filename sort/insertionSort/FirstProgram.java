package com.sort.insertionSort;

import java.util.Arrays;

public class FirstProgram {
    public static void main(String [] args){
        int [] arr = {6,5,-4,3,-2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int [] nums){
        //outer loop
        for (int i = 0; i < nums.length -1 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(nums[j] < nums [j-1]){
                    //if the above condition is true then swap
                    swap(nums,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
