package com.String;

import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String name = "Walter White Jesse Pinkman Saul Goodman";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}