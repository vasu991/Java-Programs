package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        int length = nums.length;

        while(left <= right) {
            if(nums[right] == val) {
                right--;
                count++;
                continue;
            }

            if(nums[left] == val) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
                count++;
            }
            left++;
        }
        nums = new int[length - count];
        return length - count;
    }

    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        int[] nums = new int[]{1};
        int val = 1;
        System.out.println(obj.removeElement(nums, val));

    }
}
