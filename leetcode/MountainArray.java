package com.leetcode;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class MountainArray {
    public static void main(String[] args) {

    }
    // Program to find highest element from a mountain array
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start + 1) / 2;
            if(arr[mid] > arr[mid + 1]){
                // you are in decreasing part of the array
                // mid may be the answer but check in the left side
                end = mid;
            }
            else {
                start = mid + 1;
                // cause we know that mid + 1 is greater than mid elenment

            }
        }
        return start;
//        return end;
    }

}
