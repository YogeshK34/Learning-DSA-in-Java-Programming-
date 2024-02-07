package sample_programs;

import java.util.Scanner;
public class sample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum_of_digits = 0;
        while(number>0){
            int last_digit = number % 10;
            sum_of_digits += last_digit;
            number /= 10;
        }
        System.out.print("The sum of digits of is: "+sum_of_digits);
    }
}
