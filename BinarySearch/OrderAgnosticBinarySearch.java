package com.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {0,4,8,12,16,20,24,28,32,36,40}; // ascending sorted array
        int [] arr1 = {40,36,32,28,24,20,16,12,8,41,0}; // descending sorted array
        int target = 40;
        int ans = OrderAgnosticBS(arr1,target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int [] arr, int targetElement){
        int start = 0;
        int end  = arr.length-1;

        //check if the sorted array is ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            // find the middle element
            int mid = start + (end - start)/2;

             //here we're going to take the condtion that is common for both the array(asc/desc)
            if(arr[mid] == targetElement){
                return mid;
            }
            else if (isAscending){
                if(targetElement < arr[mid]){
                    end = mid -1;
                }
                else if (targetElement > arr[mid]) {
                    start = mid+1;
                }
            }
            else {
                if(targetElement > arr[mid]){
                    end = mid -1;
                }
                else if (targetElement < arr[mid]) {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}