package com.BinarySearch2dArray;

import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[] args) {
        int [][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 7;
        System.out.println(Arrays.toString(search(array,target)));
    }
    static int[] binarySearch(int [][] matrix, int row, int columnStart, int columnEnd, int target){
        while(columnStart <= columnEnd){
            int mid = columnStart +(columnEnd - columnStart) / 2;
            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }
            if (matrix[row][mid] < target){
                columnStart = mid + 1;
            }
            else{
                columnEnd = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search(int [][] matrix, int target){
        int row = matrix.length;
        int column = matrix[0].length;
        if(row == 1){
            return binarySearch(matrix,0,0,column-1,target);
        }
        int rowStart = 0;
        int rowEnd = row - 1;
        int columnMid = column / 2;

        //run the loop while 2 rows are remaining
        while(rowStart < (rowEnd - 1)){
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][columnMid] == target) {
                return new int[]{mid, columnMid};
            }
            if (matrix[mid][columnMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }
        // now we have two rows
        // check if the answer is between the column of two rows
        if(matrix[rowStart][columnMid] == target){
            return new int[]{rowStart,columnMid};
        }
        if(matrix[rowStart + 1][columnMid] == target){
            return new int[] {rowStart,columnMid};
        }
        //check in the 4 halves
        //1st half
        if(target <= matrix[rowStart][columnMid-1]){
            return binarySearch(matrix,rowStart,0,columnMid-1,target);
        }
        //2nd half
        if(target >= matrix[rowStart][columnMid+1] && target <= matrix[rowStart][column-1]){
            return binarySearch(matrix,rowStart,columnMid+1,column-1,target);
        }
        //3rd half
        if(target <= matrix[rowStart + 1][columnMid-1]){
            return binarySearch(matrix,rowStart+1,0,columnMid-1,target);
        }
        //4th half
        else{
            return binarySearch(matrix,rowStart+1,column+1,column-1,target);
        }
    }
}