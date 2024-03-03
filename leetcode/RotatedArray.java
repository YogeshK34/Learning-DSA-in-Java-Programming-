package com.leetcode;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,5,4,3,2,1};
        System.out.println(findPivot(arr));

    }
    // in rotated array we have to find pivot
    // pivot means : (1) biggest element in array
    //               (2) from where your next numbers are ascended
    // ex arr = {1,2,3,4,5,6,5,4,3,2,1};
    // pivot = 6 cause before and after 6 the array is ascending & desending
    // step1: find povit
    // step2: search in first half  (if not found)
    // step3: search in second half
    public int search(int[] nums, int target){
        int pivot = findPivot(nums);
        // if you did not find pivot it means the array is not rotated
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if (target <= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1, nums.length-1);
    }
    static int findPivot(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find middle element
            int mid = start + (end - start) / 2;
            //4 cases

            // 1st Case
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // 2nd Case
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // 3rd Case
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }

            // 4th Case
            else {
                start = mid + 1;
            }
        }
        return -1;
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
        return -1;
    }
}