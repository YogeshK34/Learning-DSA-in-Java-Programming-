package com.DSA;

import java.util.Scanner;
class sum_of_digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum_of_digits = 0;
        while(number>0){
            int last_digit = number % 10;
            sum_of_digits = sum_of_digits + last_digit;
            number = number / 10;
        }
        System.out.println("The Sum of Number is: "+sum_of_digits);
    }
}