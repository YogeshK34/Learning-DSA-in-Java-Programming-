package com.pattern;

public class FirstProgram {
    public static void main(String[] args) {
        //pattern(5);
        pattern2(5);
    }
    static void pattern(int number){
        // run the outer for loop number of times you are having the lines
        for (int row = 1; row <= number ; row++) {
            for (int column = 1; column <= row ; column++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern1(int number){
        for (int row = 1; row <= number ; row++) {
            for (int column = 1; column <= number-row+1 ; column++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern2(int number){
        // run the outer for loop number of times you are having the lines
        for (int row = 1; row <= number ; row++) {
            for (int column = 1; column <= row ; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}