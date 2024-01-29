package com.DSA;

import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter the rate: ");
        float rate = sc.nextFloat();
        System.out.print("Enter the time in years: ");
        float time = sc.nextFloat();
        float simple_interest = (principal * time * (rate/100));
        System.out.println("Simple Interest is "+simple_interest);
        float total_amount = (principal + simple_interest);
        System.out.println("Total Amount paid is "+total_amount);
    }
}