package com.vasu.AlgoWorkspace.LeetCode;

import java.util.Arrays;

public class FindIndicesWithIndexandValueDifferenceI {

    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int f = 0;
        int s = indexDifference;
        int[] arr = new int[2];

        while(f <= (nums.length - indexDifference - 1)) {

            if(Math.abs(nums[f] - nums[s]) >= valueDifference) {
                arr[0] = f;
                arr[1] = s;
                return arr;
            }
            else {
                s++;
            }

            if(s > nums.length-1) {
                f++;
                s = f + indexDifference;
            }
        }
        return new  int[]{-1 ,-1};
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int indexDifference = 2;
        int valueDifference = 4;
        FindIndicesWithIndexandValueDifferenceI obj = new FindIndicesWithIndexandValueDifferenceI();
        System.out.println(Arrays.toString(obj.findIndices(nums, indexDifference, valueDifference)));
    }
}
