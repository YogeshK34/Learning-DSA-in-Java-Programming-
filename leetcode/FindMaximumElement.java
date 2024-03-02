package com.leetcode;

public class FindMaximumElement {
    public static void main(String[] args) {
        int [] arr = {12,13,15,17,19,25,85};
        int ans = maximumElement(arr);
        System.out.println(ans);
    }
    static int maximumElement(int [] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid  = start + (end - start ) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else {
                start =  mid + 1;
            }
        }
//         return end;
        return start;
    }
}