package com.methods;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
       int [] arr = {11,12,13,14,15};
       scope(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void scope(int [] nums){
        nums[0] = 90;
        //System.out.println(a);
        //return a;
    }
}
