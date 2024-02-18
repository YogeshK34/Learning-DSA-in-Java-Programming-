package com.arrays;

public class Sum {
    public static void main(String[] args) {
        int []arr = new int []{1, 2, 3, 4};
//        int sum = 0;
//        for (int j : arr) {
//            sum = sum + j;
//        }
        System.out.println(sum(arr));
//        System.out.println(Arrays.toString(arr));
    }
//    Running Sum of 1d Array
    public static int sum(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
//        System.out.print(sum);
        return sum;
    }
}
