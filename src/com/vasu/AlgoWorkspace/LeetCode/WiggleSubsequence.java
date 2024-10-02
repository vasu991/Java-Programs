package com.vasu.AlgoWorkspace.LeetCode;

public class WiggleSubsequence {
    public static int wiggleMaxLength(int[] nums) {
        if(nums.length < 3) {
            if(nums.length == 1) {
                return 1;
            }
            if(nums[0] == nums[1]) {
                return 1;
            }
            return nums.length;
        }
        int maxLen = 0;
        boolean flag = true;
        for(int i = 1; i < nums.length - 1; i++) {
            int prev = nums[i] - nums[i-1];
            int curr = nums[i+1] - nums[i];
            if(prev != 0 || curr != 0) {
                flag = false;
            }
            if((prev > 0 && curr < 0) || (prev < 0 && curr > 0)) {
                maxLen++;
            }
        }
        if(flag) {
            return 0;
        }
        return maxLen+2;

    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(wiggleMaxLength(nums));

    }
}
