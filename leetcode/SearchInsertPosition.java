package com.leetcode;
//https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6};
        int target = 7;
        System.out.println(searchInsert(arr,target));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            //finding the middle element
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}