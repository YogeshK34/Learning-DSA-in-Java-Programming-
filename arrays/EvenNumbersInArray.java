package com.arrays;

import java.util.Arrays;

public class EvenNumbersInArray {
    public static void main(String[] args) {
        int [] arr = {12,13,14,15,16,17,18};
        returnEvenNumber(arr);
    }
    public static void returnEvenNumber(int [] array ){
        for(int element: array){
            if(element % 2 == 0){
                System.out.print(element +" ");
            }
        }
    }

}
