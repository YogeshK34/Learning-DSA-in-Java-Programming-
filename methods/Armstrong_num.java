package com.methods;

import java.util.Enumeration;
import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        //System.out.print(isArmstrong(number));
        for (int i = 100; i < 1000 ; i++) {
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
//    printing all 3 digit armstrong numbers
    static boolean isArmstrong(int number){
        int original_number = number;
        int sum = 0;
        while(number > 0){
            int remainder = number % 10;
            number = number / 10;
            sum = sum + remainder*remainder*remainder;
        }
        return sum == original_number;
    }
}
