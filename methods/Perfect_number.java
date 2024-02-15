package com.methods;

public class Perfect_number {
    public static void main(String[] args) {
        perfect_number(28);
    }
//    perfect_number = (addition of factors) = number
        static void perfect_number(int number){
        int sum = 0;
            for(int i = 1; i < number ; i++) {
                if(number % i == 0){
                    sum = sum + i;
                }
            }
            if(sum == number){
                System.out.print(number+" is a perfect number");
            } else{
                System.out.print(number+" is not a perfect number");
            }
    }
}
