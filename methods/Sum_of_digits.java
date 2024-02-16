package com.methods;

public class Sum_of_digits {
    public static void main(String[] args) {
        sum(98);
    }
//    Sum of digits
    static void sum(int num) {
        int sum = 0;
        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;
            sum += last_digit;
        }
        System.out.print("The sum of digits is: " + sum);
    }
}
