package com.leetcode;
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArray {
    public static void main(String[] args) {
        int [] arr = {3,5};
        System.out.println(specialArray(arr));
    }
    static int specialArray(int[] nums) {
        int[] arr = new int [1001];
        for(int i : nums)
            arr[i]++;
        int total = nums.length;
        for(int i =0;i<1001;i++){
            if(i == total)
                return i;
            total = total-arr[i];
        }
        return  -1;
    }
}
