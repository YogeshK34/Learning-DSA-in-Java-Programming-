package com.arrays;
import java.util.Scanner;
public class ThreeDimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][][] arr = new int[2][2][2];
        for (int row = 0; row < arr.length ; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                for (int column3 = 0; column3 < arr[column].length; column3++) {
                    System.out.print("Enter the array elements: ");
                    arr[row][column][column3] = sc.nextInt();
                }
            }
        }
        for(int [][] array: arr){
            for(int [] row : array){
                for(int element : row){
                    System.out.print(element+" ");
                }
            }
        }
    }
}