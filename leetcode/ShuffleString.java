package com.leetcode;
//https://leetcode.com/problems/shuffle-string/description/

public class ShuffleString {
    public static void main(String[] args) {
        String s = "royal";
        int [] indices = {5,2,4,3,1};
    }
    static String restoreString(String s, int[] indices) {
        char [] str = new char [s.length()];
        for(int i = 0; i < s.length();i++){
            str[indices[i]] = s.charAt(i);
        }
        return String.valueOf(str);
    }
}