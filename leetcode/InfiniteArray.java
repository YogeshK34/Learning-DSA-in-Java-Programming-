package com.leetcode;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {10,11,12,13,14,15,16,17,18,19,20};
        int target = 15;
        int ans = findIndex(arr,target);
        System.out.println(ans);
    }
    // find the index(position) element in a sorted array
    static int findIndex(int []arr,int target){
        // creating box to find the start and end of element
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            // new end would be double the box
            // formula for new end  = end = end + (boxsixe)*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
       return binarySearch(arr,target,start,end);

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
