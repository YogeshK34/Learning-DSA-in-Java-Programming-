package com.Recursion;

public class FirstProgram {
    public static void main(String[] args) {
        print(2);
    }

    static void print(int n) {
        System.out.println(n);
        if (n == 16) {
            // System.out.println(n);
            return;
        }
        print(n + 2);
    }
}