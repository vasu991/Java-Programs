package com.vasu.AlgoWorkspace.LeetCode;



public class HouseRobber {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i+1] = Math.max(dp[i],  dp[i-1] + nums[i]);
        }

        return dp[nums.length];
    }


    public static void main(String[] args) {
        HouseRobber obj = new HouseRobber();
        int[] nums = {1, 2, 3, 1};
        System.out.println(obj.rob(nums));
    }
}
