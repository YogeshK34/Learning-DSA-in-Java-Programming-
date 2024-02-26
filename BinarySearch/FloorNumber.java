package com.BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        // the greatest number <= target
        int [] arr = {14,16,18,24,27,30};
        int target = 17;
        int ans = floorNumber(arr,target);
        System.out.println(ans);
    }
    static int floorNumber(int [] arr, int targetElement){
        int start = 0;
        int end = arr.length-1;
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
        return end;
    }
}