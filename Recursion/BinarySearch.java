package com.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        //int target = 4;
        int ans = search(arr,4,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int [] arr, int target, int start, int end){
        //base condition
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if (target > arr[mid]) {
            return search(arr,target,mid + 1,end);
        }
        return search(arr,target,start,mid - 1);
    }
}
