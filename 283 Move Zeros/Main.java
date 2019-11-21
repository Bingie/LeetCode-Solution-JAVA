package bingqi.liu;

import java.util.Arrays;

/**
 * LeetCode: https://leetcode.com/problems/move-zeroes/
 */


public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution solution = new Solution();
        int[] arr = new int[]{1,0,1};
        solution.moveZeroesBest(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    // faster than 100%
    public void moveZeroesBest(int[] nums) {
        int moves = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[moves] = nums[i];
                if (moves != i) {
                    nums[i] = 0;
                }
                moves++;
            }
        }
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}