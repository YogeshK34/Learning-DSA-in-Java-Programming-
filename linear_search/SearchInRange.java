package com.linear_search;

import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(search_in_range(arr,target,2,9));
    }
    static int search_in_range(int [] array,int target,int start,int end){
        if(array.length == 0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int element = array[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
