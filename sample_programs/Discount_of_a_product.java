package sample_programs;

import java.util.Scanner;
public class Discount_of_a_product {
    public static void main(String[] args) {

        //To calculate discount of a product
        // step 1: get the product price from the user
        // step 2: get the discount (percentage)
        // step 3: calculate the discount on product
        // step 4: minus the discount amount from the original amount
        // step 5: print the discounted amount

        //step 1:
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Original Amount of the product: ");
        int original_amount = sc.nextInt();

        // step 2:
        System.out.print("Enter the discount in (percentage): ");
        int discount = sc.nextInt();

        //step 3:
        int s = 100-discount;

        //step 4:
        int discounted_amount = (s*original_amount)/100;
        System.out.print("The Discounted Amount is: "+discounted_amount);
    }
}