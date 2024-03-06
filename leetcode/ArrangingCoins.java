package com.leetcode;
//https://leetcode.com/problems/arranging-coins/description/
public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(findRows(9));

    }
    static int findRows(int num){
        long num_long  = (long) num;
        long start = 1;
        long end = num_long;
        while(start <= end){
            // find middle element
            long mid = start + (end - start) / 2;
            if(mid * (mid + 1) / 2 <= num_long){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (int) start - 1;
    }
}
