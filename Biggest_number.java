package com.DSA;

import java.util.Scanner;
public class Biggest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_no = sc.nextInt();
        int second_number= sc.nextInt();
        if (first_no > second_number){
            System.out.println("First number is bigger than second number1");
        }
        else {
            System.out.println("Second number is bigger than first!");
        }
    }
}
