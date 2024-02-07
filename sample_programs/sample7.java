package sample_programs;

import java.util.Scanner;

public class sample7 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Get the number of numbers from the user
                System.out.println("Enter the number of numbers: ");
                int n = scanner.nextInt();

                // Create an array to store the numbers
                int[] numbers = new int[n];

                // Get the numbers from the user
                System.out.println("Enter the numbers: ");
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextInt();
                }

                // Calculate the sum of the numbers
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += numbers[i];
                }

                // Calculate the average of the numbers
                double average = (double) sum / n;

                // Print the average to the console
        System.out.println("The average of the numbers is: " + average);
    }
}

