package com.leetcode;
//https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
    public static void main(String[] args) {

    }
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int result = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid)){
                result  = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return result;
    }
}
