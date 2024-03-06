package com.leetcode;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumII {
    public static void main(String[] args) {

    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length -1;
        while(start <= end){
            int sum = numbers[start] + numbers[end]; // base case
            if (sum == target){
                return new int[] {start + 1, end + 1};
            } else if (sum < target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[] {-1,-1};
    }
}
