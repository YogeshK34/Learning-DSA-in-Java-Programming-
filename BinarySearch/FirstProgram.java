package com.BinarySearch;

public class FirstProgram {
    public static void main(String[] args) {
// three conditions for binary search
//        1: find the middle element
//        2: if target is bigger(>)than middle element search in the right
//        3: if target is less (<)than middle element search in the left
//        4: if target is equal(=) to middle element we found the answer
//        5: search will execute till start is less (<) or (=) to the end
        int [] arr = {0,4,8,12,16,20,24,28,32,36,40};
        int targetElement = 36;
        int ans = returnIndex(arr,targetElement);
        System.out.println(ans);
    }
    static int returnIndex(int [] arr,int targetElement){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            // find the middle element
            int mid = start+( end - start)/2;
            if(targetElement < arr[mid]){
                end = mid -1;
            }
            else if (targetElement > arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
