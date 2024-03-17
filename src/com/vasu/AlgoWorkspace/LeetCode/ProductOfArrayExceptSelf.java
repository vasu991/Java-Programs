package com.vasu.AlgoWorkspace.LeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        int suffix = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            prefix[i] = prefix[i]*suffix;
            suffix = nums[i]*suffix;
        }
        return prefix;

    }
}
