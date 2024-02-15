package com.methods;

import java.util.Scanner;
public class Multiplication_number {
    public static void main(String[] args) {
        table(15);
        table(16);
        table(17);
    }
    static void table(int number){
        for (int i = 1; i < 11 ; i++) {
            System.out.println(number +" x "+i+" = "+ number*i);
        }
    }
}
