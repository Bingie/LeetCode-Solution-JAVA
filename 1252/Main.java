package bingqi.liu;

/**
 * LeetCode: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
  */


public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution solution = new Solution();
        int result = 0;
        result = solution.oddCells(1, 1, new int[][]{{0, 0}});
        result = solution.oddCells2(1, 1, new int[][]{{0, 0}}); // 100% faster
        System.out.println(result);
    }
}

class Solution {

    public int oddCells2(int n, int m, int[][] indices) {
        int r = 0, c = 0;
        boolean[] rb = new boolean[n], cb = new boolean[m];
        for(int[] is: indices) {
            r += (rb[is[0]] = !rb[is[0]]) ? 1 : -1;
            c += (cb[is[1]] = !cb[is[1]]) ? 1 : -1;
        }

        return r * (m - c) + c * (n - r);
    }

    public int oddCells(int n, int m, int[][] indices) {
        int numberOfOdd = 0;
        int[][] primeArr = new int[n][m];

        for (int cDices = 0; cDices < indices.length; cDices++) {
            for (int c = 0; c < m; c++) {
                primeArr[indices[cDices][0]][c]++;
            }
            for (int d = 0; d < n; d++) {
                primeArr[d][indices[cDices][1]]++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (primeArr[i][j] % 2 == 1) {
                    numberOfOdd++;
                }
            }
        }

        return numberOfOdd;
    }
}