package com.vasu.AlgoWorkspace.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class CountSubarraysWhereMaxElementAppearsAtLeastKTimes {
    public long countSubarrays(int[] nums, int k) {
        int l = 0;
        int r = k - 1;
        int countK = 0;
        int count = 0;
        int max = max(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        while(k + l <= nums.length) {

        }
        return 0l;

    }

    public static int max(int[] nums) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > m) {
                m = nums[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {

    }
}
