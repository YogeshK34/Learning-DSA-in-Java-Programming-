package com.linear_search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4,},
                {5,6,7},
                {8,9,10,11,12},
                {13,14}
        };
        int target = 12;
        int [] ans = searchin2darray(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchin2darray(int [][] array, int target){
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == target){
                    return new int []{row,column};

                }

            }

        }
        return new int[]{-1,-1};
    }
}
