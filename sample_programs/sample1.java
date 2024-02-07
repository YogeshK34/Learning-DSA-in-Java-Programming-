package sample_programs;

import java.util.Scanner;
public class sample1 {
    public static void main(String[] args) {
        // Yogesh is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.
       // Scanner sc = new Scanner(System.in);
        String month = "August";
        int august = 31;
        /*to calculate how many days yogesh can go out we need to divide the no_of_days with 2 and the remainder
         is the answer
        */
        int no_of_days = 31/2;
        System.out.println("The no of days Yogesh can go out in "+month+" is: "+no_of_days);
    }
}
