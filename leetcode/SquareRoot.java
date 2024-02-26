package com.leetcode;

import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
//        Program to find square root of a number
//        square of a number = (number * number)
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // num = 12
        int square  = num*num; // square = 144
        System.out.println(square);
        int ans = square;
        while(square == 1){
            for (int squareroot = 2; squareroot <= 3; squareroot++) {
                ans = square / squareroot;
            }
            System.out.println(ans);
        }
    }
}
