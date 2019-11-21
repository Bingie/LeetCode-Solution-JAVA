package bingqi.liu;

import java.util.Arrays;

/**
 * LeetCode: https://leetcode.com/problems/missing-number/
 */


public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution solution = new Solution();
        int[] arr = new int[]{1};

        int result = solution.missingNumber(arr);
        System.out.println(result);
    }
}

class Solution {

    public int missingNumberBest(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++)
            sum += i - nums[i];
        return sum;
    }

    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        int missingNum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 != nums[i-1]) {
                missingNum = nums[i] - 1;
                return missingNum;
            }
        }
        return (nums[nums.length - 1] + 1);
    }
}