package com.leetcode;

public class RotationCount {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(countRotations(arr));
    }
    static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }
    static int findPivot(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find a middle element
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
}