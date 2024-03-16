package com.vasu.AlgoWorkspace.MiscellaneousProblems;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> left_sum = new HashMap<>();
        int count = 0;
        int currSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if(currSum == k) {
                count++;
            }

            if(left_sum.containsKey(currSum - k)) {
                count += left_sum.get(currSum - k);
            }


            if(left_sum.containsKey(currSum)) {
                left_sum.replace(currSum, left_sum.get(currSum) + 1);
            }
            else {
                left_sum.put(currSum, 1);
            }



        }
        System.out.println(left_sum);
        return count;

    }
    public static void main(String[] args) {
        SubarraySumEqualsK o = new SubarraySumEqualsK();
        System.out.println(o.subarraySum(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0));

    }
}
