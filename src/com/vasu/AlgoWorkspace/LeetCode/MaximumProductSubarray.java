package com.vasu.AlgoWorkspace.LeetCode;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 1};
        System.out.println("Maximum Product: " + maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int ans = nums[0];
        int min = 1, max = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == 0) {
                min = 1;
                max = 1;
                ans = Math.max(ans, nums[i]);
            }
            int temp = min;
            min  = Math.min(nums[i], Math.min(min*nums[i], max*nums[i]));
            max  = Math.max(nums[i], Math.max(temp*nums[i], max*nums[i]));
            ans = Math.max(ans, max);

        }
        return ans;

    }
}
