package com.methods;

import java.util.Scanner;

public class Pythagorean_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        check_triplet(num1,num2,num3);
    }
//    Write a function to check if a given triplet is a Pythagorean triplet or not.
//    (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
    public static void check_triplet(int num1,int num2,int num3){
        if((num1 * num1) + (num2 * num2) == (num3 * num3)){
            System.out.println("It's a Pythagorean Triplet");
        }
        else{
            System.out.println("It's not a Pythagorean Triplet1");
        }
    }
}
