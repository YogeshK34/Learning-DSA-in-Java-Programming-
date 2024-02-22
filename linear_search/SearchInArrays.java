package com.linear_search;

public class SearchInArrays {
    public static void main(String[] args) {
        int [] array = {1,23,545,89,47,26};
        int target = 545;
       int ans = search_in_array(array,target);
        System.out.println(ans);
    }
//    static boolean search_in_array(int [] arr,int target){
//        for (int i : arr) {
//            if (target == i) {
//                return true;
//            }
//        }
//        return false;
//    }
    static int search_in_array(int [] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
