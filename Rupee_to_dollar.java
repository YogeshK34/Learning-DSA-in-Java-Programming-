package com.DSA;

import java.util.Scanner;
public class Rupee_to_dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 rupee is 0.12 dollars
        // whereas 1 dollar is 83 rupee
//        float one_rupee = sc.nextFloat();
//        float one_dollar = (float) (one_rupee*(0.012));
//        System.out.println(one_dollar);
         float one_dollar = sc.nextFloat();
         float one_rupee = (float) (one_dollar * (83.15));
        System.out.println(one_dollar + " dollars is equal to "+ one_rupee + " rupees");
    }
}