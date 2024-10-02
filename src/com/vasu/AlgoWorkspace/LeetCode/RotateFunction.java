package com.vasu.AlgoWorkspace.LeetCode;

public class RotateFunction {
    public static int maxRotateFunction(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int r = nums.length - 1;
        int sum = 0;
        int mem = 0;
        for(int i = 0; i < nums.length; i++) {
            mem = mem + nums[i]*i;
            sum = sum + nums[i];
        }
        int ans = mem;

        for(int i = 1; i < nums.length; i++) {
            int add = sum - nums[r]*nums.length;
            mem = mem + add;
            r--;
            if(mem > ans) {
                ans = mem;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5, 6};
        System.out.println(maxRotateFunction(nums));

    }
}
