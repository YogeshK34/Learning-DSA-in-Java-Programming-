package com.arrays;
import java.util.Scanner;
public class Random_column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9,},
        };
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }
    }
}
