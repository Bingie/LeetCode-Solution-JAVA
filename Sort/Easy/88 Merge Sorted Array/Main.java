package bingqi.liu;
/*
    88. Merge Sorted Array: https://leetcode.com/problems/merge-sorted-array/
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        solution.mergeBest(nums1,m,nums2,n);
        solution.merge(nums1,m,nums2,n);
    }
}

class Solution {
    // Best Solution
    public void mergeBest(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k = m+n-1;
        while(i >=0 && j>=0)
        {
            if(nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        while(j>=0)
            nums1[k--] = nums2[j--];
    }

    // My Solution
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            if (n > 0) {
                nums1 = nums2;
            }
            return;
        }
        if (nums2 == null || nums2.length == 0) {
            return;
        }

        int nIndex = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[nIndex++];
        }

        for (int i = 0; i < m + n - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (nums1[j] < nums1[i]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}