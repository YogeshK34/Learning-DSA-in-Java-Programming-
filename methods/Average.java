package com.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        average();
    }
//    Average = (Addition of numbers)+(number of numbers)
//    step1: get the no of numbers
//    step2: store that into an array
//    step3: get the numbers and store that number into an array(step2)
//    step4: calculate sum ny for loop(iterating)
//    step5: display the result
    static void average(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want: ");
        int no_of_numbers  = sc.nextInt();

        int [] arr = new int [no_of_numbers];

        System.out.print("Enter the numbers:");
        for (int i = 0;i<no_of_numbers; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i<no_of_numbers ; i++) {
            sum += arr[i];
        }

        float average = (float)sum/no_of_numbers;
        System.out.print("The average is: "+average);
    }
}
