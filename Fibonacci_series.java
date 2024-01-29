package com.DSA;

import java.util.Scanner;
class Fibonacci_series{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter till what term you want fibonacci series: ");
         int term = sc.nextInt();
         int a = 0;
         int b = 1;
         int c;
         System.out.println("The Fibonacci series up to "+ term + " is ");
         for (int i = 1;i<=term;i++){
             c = a+b;
             System.out.print(c + " ");
             a = b;
             b = c;
         }
     }
 }