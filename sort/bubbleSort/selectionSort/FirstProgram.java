package com.sort.selectionSort;

import java.util.Arrays;
public class FirstProgram {
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the maximum value and swap
            int last_element = arr.length - i -1;
            //int max = maxElement(arr,0,last_element);
            int min = minElement(arr,0,last_element);
            swap(arr,min,last_element);
        }
    }
    static int maxElement(int [] arr,int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static int minElement(int [] arr, int start, int end){
        int min = start;
        for (int i = start; i <= end; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }

     static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
     }
}
