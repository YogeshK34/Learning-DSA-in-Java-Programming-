package com.leetcode;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        
    }
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        // check for first occurrence first
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    //this function return the index value of target
    int search(int [] nums,int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        // start while loop
        while(start <= end){
            // find the middle element
            int mid = start+( end - start)/2;

            if(target < nums[mid]){
                end = mid -1;
            }
            else if (target > nums[mid]) {
                start = mid+1;
            }
            else {
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }
                else{
                    start = mid = 1;
                }
            }
        }
        return ans;
    }
}
