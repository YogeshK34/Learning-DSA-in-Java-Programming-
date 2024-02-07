package sample_programs;

import java.util.Scanner;

public class Average_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // step 1: get the number of numbers from user
        // step 2: create an array to store the numbers
        // step 3: get the numbers from the user
        // step 3: calculate the sum of numbers
        // step 4: calculate the average

        //step 1
        System.out.print("Enter how many numbers you want: ");
        int no_of_numbers = sc.nextInt();

        //step 2
        int [] numbers =  new int[no_of_numbers];

        //step 3
        System.out.println("Enter the numbers: ");
        for(int i = 0;i<no_of_numbers;i++){
            numbers[i] = sc.nextInt();
        }

        //step 4
        int sum = 0;
        for (int i = 0; i < no_of_numbers; i++) {
            sum = sum + numbers[i];
        }

        //step 5
        float average = (float) sum / no_of_numbers;
        System.out.print("The average of "+no_of_numbers+" is: "+average);

    }
}
