package com.DSA;
import java.util.Scanner;
class Palindrome_string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter a String: ");
        String name = sc.next();
        int i = 0;
        int j = name.length()-1;
        while(i<j){
            if(name.charAt(i) != name.charAt(j)){
                System.out.println("String is not palindrome");
                System.exit(0);
            }
            i++;
            j++;
        }
        System.out.println("String is Palindrome");
    }
}