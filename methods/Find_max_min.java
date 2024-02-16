package com.methods;

import java.util.Scanner;

public class Find_max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.println("Maximum number is: "+max_num(number1,number2,number3));
        System.out.println("Minimum number is: "+min_num(number1,number2,number3));

    }
//  Define two methods to print the maximum and the minimum number respectively
//  among three numbers entered by the user.
    public static int max_num(int num1,int num2,int num3){
        return Math.max(Math.max(num1, num2),num3);
    }
    public static int min_num(int num1,int num2,int num3){
        return Math.min(Math.min(num1,num2),num3);
    }
}
