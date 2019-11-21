package bingqi.liu;

import java.util.Arrays;

/**
 * LeetCode: https://leetcode.com/problems/contains-duplicate/
 */


public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution solution = new Solution();
        int[] arr = new int[]{1,2,3,4};

    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if ( nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}