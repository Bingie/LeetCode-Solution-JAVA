package bingqi.liu;

import java.util.Arrays;

/**
 * LeetCode: https://leetcode.com/problems/array-partition-i/
 */


public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution solution = new Solution();
        int[] arr = new int[]{1,2,3,4};
        int result = solution.arrayPairSum(arr);
        System.out.println(result);
    }
}

class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i+=2) {
            result += nums[i];
        }

        return result;
    }
}