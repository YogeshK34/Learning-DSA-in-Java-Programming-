package com.linear_search;

public class FindMaximum {
    public static void main(String[] args) {
        int [] arr = {123,165465,46551,4323};
        find_max(arr);
    }
    static void find_max(int [] array){
        // let's assume the maximum is the 0th index
        int maximum = array[0];
        //Create a for loop to iterate between the array
        for (int index = 0; index < array.length; index++) {
            if(array[index]>maximum){
                maximum = array[index];
            }
        }
        System.out.println(maximum+" is the maximum number in the array!");
    }
}
