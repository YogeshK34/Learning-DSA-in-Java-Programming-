package com.linear_search;

public class FindMinimum {
    public static void main(String[] args) {
        int [] arr = {15,10,8,2,-2};
        find_min(arr);
    }

    static void find_min(int[] arr) {
        int min = arr[0];
//        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
//                System.out.println(arr[i] + " is the smallest number1");
                min = arr[i];
            }
        }
        System.out.println(min+" is the minimum value in the array!");
    }
}
