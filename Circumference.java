package com.methods;

public class Circumference {
    static float pi = 3.14f;
    public static void main(String[] args) {
        float circumference = circumference(4);
        System.out.println("Circumference of circle is: "+circumference);

        float area = area(4);
        System.out.print("Area of circle is: "+area);
    }
//    Write a program to print the circumference and
//    area of a circle of radius entered by user by defining your own method.
    public static float circumference(int rad){
        float circum = (2 * pi * rad);
        return circum;
    }
    public static float area(int rad){
        float area = pi * rad*rad;
        return area;
    }
}
