package com.methods;

import java.util.Scanner;

public class Check_even_odd {
    public static void main(String[] args) {
//        check_evenodd(14);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number if it's even or odd: ");
        int num1 = sc.nextInt();

        if(check_evenodd(num1)){
            System.out.print(num1+" is an even number");
        }
        else {
            System.out.print(num1+ " is an odd number");
        }
    }
//    Define a program to find out whether a given number is even or odd.
    public static boolean check_evenodd(int num){
//        if(num % 2 == 0){
//            System.out.print("Even number");
//        }
//        else{
//            System.out.print("Odd number");
//        }
        return num % 2 == 0;
    }
}
