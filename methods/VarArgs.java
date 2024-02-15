package com.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func();
        func("Walter","Jesse","Saul");
        func(12,12,12,12,12);
    }
    static void func(){
        System.out.println("Running the empty var_args");
        System.out.println("Enter a value!");
    }
    static void func(int ...t){
        System.out.println("Running the integer var_args");
        System.out.println(Arrays.toString(t));
//        return t;
    }
    static void func(String ...t){
        System.out.println("Running the String var_args");
        System.out.println(Arrays.toString(t));
    }
}
