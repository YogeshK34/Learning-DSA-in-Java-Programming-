package com.methods;

import javax.sound.sampled.EnumControl;

public class Scope {
    public static void main(String[] args) {
        int num;
//        System.out.println(num);
//        int value = func();
//        scoping in for loop
//        for (int i = 0; i <= 5 ; i++) {
//            System.out.println(i);
//        }

//        System.out.println(i);
//      this is block scope
        {
            num = 99;
           int value = 67;
//            System.out.println(num);
        }
        System.out.println(num);
//        System.out.println(value);
        int value = 87;
        
        num = 45;
        System.out.println(num);

    }
//    Scoping in for loop


//    This is function scope
    static int func(){
        int num = 70;
        System.out.println(num);
        return num;

    }
}
