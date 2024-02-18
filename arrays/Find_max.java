package com.arrays;

public class Find_max {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15};
        System.out.println("The Maximum element from the array is: "+find_max(arr));
    }
    public static int find_max(int [] array){
        int max_value = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max_value){
                max_value = array[i];
            }
        }
        return max_value;
    }
}
