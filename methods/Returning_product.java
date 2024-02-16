package com.methods;

import java.util.Scanner;

public class Returning_product {
    public static void main(String[] args) {
        int product = return_product(12,15);
        System.out.println("Product is: "+product);
    }
//    Define a method that returns the product of two numbers entered by user.
    public static int return_product(int num1,int num2){
        int product = (num1*num2);
        return product;
    }
}
