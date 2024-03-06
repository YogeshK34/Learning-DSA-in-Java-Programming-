package com.leetcode;
//https://leetcode.com/problems/guess-number-higher-or-lower/

public class GuessTheNumber {
    public static void main(String[] args) {
    }
    
    static int guessNumber(int n){
        int l = 0;
        int r = n;
        while (l < r) {
            final int m = l + (r - l) / 2;
            if (guess(m) <= 0) // -1, 0
                r = m;
            else
                l = m + 1;
        }

        return l;
    }
}