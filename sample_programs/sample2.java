package sample_programs;

import java.util.Scanner;

public class sample2 {
    public static void main(String[] args) {
        /*perfect number  = sum of factors = that_number
        for example facors of 6 are : 1 2 3 and addition of 1 + 2 + 3 = 6 henceforth 6 is a perfect number
        * */
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        for(int i = 1; i <=number; i++){
//            if(number % i == 0){
//                System.out.print(i+" ");
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
