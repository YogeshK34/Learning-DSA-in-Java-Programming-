package com.sort.cyclicSort;

public class SecondProgram {
    public static void main(String[] args) {

    }
    static void cyclicSort(int [] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
