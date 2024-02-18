package com.arrays;

import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int [] array = {15,30,45,60,75,90};
        reverse_array(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverse_array(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            // swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int [] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
