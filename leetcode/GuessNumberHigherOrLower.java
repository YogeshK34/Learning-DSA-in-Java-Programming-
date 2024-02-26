package com.leetcode;

import java.util.Scanner;
public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        // Guess which number the user picked
        Scanner sc = new Scanner(System.in);


        //Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
        //
        //You call a pre-defined API "int guess(int num)", which returns three possible results:
        //
        //-1: Your guess is higher than the number I picked (i.e. num > pick).
        //1: Your guess is lower than the number I picked (i.e. num < pick).
        //0: your guess is equal to the number I picked (i.e. num == pick).


        //define a method int guess(int num)
        //define an int pick
        // define an int guess, so we can guess the number which user enter
//        int pick = sc.nextInt();
//        int guess = sc.nextInt();
        guess();
    }
    public static void guess(){
        Scanner sc = new Scanner(System.in);
        int pick = 3; //let's assume the number as 3
        int guess = sc.nextInt();
        /* let's assume the number is bigger than zero */
        while(pick > 0){
            if (guess > pick){
                System.out.print("-1");
            } else if (guess < pick) {
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
            pick++;
        }
    }

}
