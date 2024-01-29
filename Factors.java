package com.DSA;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        /*num = 10
        i = 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factors of: ");
        int number = sc.nextInt();
        System.out.print("The Factors of "+ number +" are:");
        for(int i = 1;i<=number;i++){
            if(number%i == 0){
                System.out.print(i+" ");
            }
           // System.out.println(i);
        }
    }
}
