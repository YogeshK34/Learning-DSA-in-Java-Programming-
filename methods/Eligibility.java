package com.methods;

import java.util.Scanner;
public class Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age to check if He/She is eligible to give vote: ");
        int age = sc.nextInt();
        if(eligibility_check(age)){
            System.out.print("He/She is eligible for voting");
        }
        else{
            System.out.print("He/She is not eligible for voting");
        }
    }
//    A person is eligible to vote if his/her age is greater than or equal to 18.
//    Define a method to find out if he/she is eligible to vote.
    public static boolean eligibility_check(int age){
        return  (age > 18);
    }
}
