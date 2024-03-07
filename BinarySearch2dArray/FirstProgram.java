package com.BinarySearch2dArray;

import java.util.Arrays;
public class FirstProgram {
    public static void main(String[] args) {
        int [][] array = {
                {10,20,30,40},
                {12,22,32,42},
                {14,24,34,44},
                {16,26,36,46},
        };
        System.out.println(Arrays.toString(searchIn2dArray(array,29)));
    }
    //program to search in 2d arrays
    static int[] searchIn2dArray(int [][] array,int target){
        int row = 0;
        int column = array.length-1;
        while(row < array.length && column >= 0){
            if(array[row][column] == target){
                return new int[] {row,column};
            }
            if(array[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[] {-1,-1};
    }
}