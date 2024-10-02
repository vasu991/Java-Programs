package com.vasu.AlgoWorkspace.LeetCode;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] ans = new int[2];
        while(l < r) {
            int sum = numbers[l] + numbers[r];

            if(sum < target) {
                l++;
            }
            else if(sum > target){
                r--;
            }
            else {
                break;
            }
        }

        ans[0] = l+1;
        ans[1] = r+1;

        return ans;
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
