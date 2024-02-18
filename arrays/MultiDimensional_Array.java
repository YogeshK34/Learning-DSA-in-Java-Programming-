package com.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensional_Array {
    public static void main(String[] args) {
//        Syntax: datatype [] variable_name = new datatype [size];
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print("Enter the array element: ");
                arr[row][column] = sc.nextInt();
            }
        }
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }
    }
}
