package com.methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Addition is: "+sum_of_numbers(num1,num2));

    }
//    Write a program to print the sum of two numbers entered by user by defining your own method.
    public static int sum_of_numbers(int num1,int num2){
        int addition = (num1+num2);
        return addition;
    }

}
