package com.methods;

public class Factors {
    public static void main(String[] args) {
        factors(15);
    }
    static void factors(int number){
        System.out.print("Factors of "+number+" are: ");
        for (int i = 1; i <= number ; i++) {
            if( number % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
