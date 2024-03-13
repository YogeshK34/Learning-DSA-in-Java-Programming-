package com.leetcode;

public class NegativeIntegerInSortedMatrix {
    public static void main(String[] args) {
        int [][] grid = {
                { 4, 3, 2, -1},
                { 3, 2, 1, -1},
                { 1, 1,-1, -2},
                {-1,-1,-2, -3}
        };
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;
        int ans = 0;
        int i = m - 1;
        int j = 0;

        while (i >= 0 && j < n) {
            if (grid[i][j] < 0) {
                ans += n - j;
                --i;
            } else {
                ++j;
            }
        }
        return ans;
    }
}