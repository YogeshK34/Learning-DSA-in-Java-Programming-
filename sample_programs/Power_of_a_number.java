package sample_programs;

import java.awt.*;
import java.util.Scanner;

public class Power_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of the number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent of the number: ");
        int exponent = sc.nextInt();
        int output = 1;
        for (int i = 0; i < exponent ; i++) {
            output = output * base;
        }
        System.out.print(base + " raise the power of " + exponent + " is " + output);
    }
}
