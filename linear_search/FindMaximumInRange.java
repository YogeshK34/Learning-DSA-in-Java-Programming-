package com.linear_search;

public class FindMaximumInRange {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,8,9};
        find_maximum_number(arr,3,5);
    }
    static void find_maximum_number(int [] arr,int start,int end){
        if(arr.length == 0){
            System.out.println("Empty array!");
        }
        //let's assume maximum number is arr of 0th index
        int maximum_number = arr[0];
        for (int index = start; index <= end; index++) {
            if(arr[index] > maximum_number){
                maximum_number = arr[index];
            }
        }
        System.out.println(maximum_number+" is the maximum number betweeen "+start+" and "+end);
    }
}