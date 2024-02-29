package com.leetcode;

public class FindInMountainArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,1,2,3};
        int target = 3;
        System.out.println(search(arr,target));
    }
    // return the target element's minimum index given in the array
    // arr = {1,2,3,4,1,2,3};
    // target = 3;
    // output = 3;
    static int search(int [] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        // searching in 2nd half
        return binarySearch(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start + 1) / 2;
            if(arr[mid] > arr[mid + 1]){
                // you are in decreasing part of the array
                // mid may be the answer but check on the left side
                end = mid;
            }
            else {
                start = mid + 1;
                // because we know that mid + 1 is greater than mid-element
            }
        }
        // in the end we can return either start/end cause both point towards the same element
//        return start;
        return end;
    }
    static int binarySearch(int [] arr, int targetElement,int start,int end){
        // start while loop
        while(start <= end){
            // find the middle element
            int mid = start+( end - start)/2;

            if(targetElement < arr[mid]){
                end = mid -1;
            }
            else if (targetElement > arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}