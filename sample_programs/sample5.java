package sample_programs;

import java.util.Scanner;

public class sample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factorial of: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= num;i++){
            factorial = factorial * i;
        }
        System.out.print("The factorial of "+num+" is "+factorial);
    }
}
