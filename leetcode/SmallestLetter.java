package com.leetcode;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        // start while loop
        while(start <= end){
            // find the middle element
            int mid = start+( end - start)/2;

            if(target < letters[mid]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start % letters.length ];
    }
}

