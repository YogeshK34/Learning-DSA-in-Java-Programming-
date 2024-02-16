package com.methods;

public class Factorial {
    public static void main(String[] args) {
        factorial(5);
    }
//    Factorial = (num = 4)
//    4*3*2*1
    static void factorial(int number){
        int factorial = 1;
        for (int i = number; i>=1 ; i--) {
            factorial = factorial*i;
        }
        System.out.print("The factorial of "+number+" is: "+factorial);
    }
}
