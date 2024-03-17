package com.vasu.AlgoWorkspace.LeetCode;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.min(nums[0], nums[1]);
        if(nums[0] < nums[nums.length - 1]) return nums[0];
        int left = 0;
        int right  = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid+1] < nums[mid]) return nums[mid+1];
            if(nums[mid-1] > nums[mid]) return nums[mid];
            if(nums[left] < nums[mid]) {
                left = mid + 1;
            }
            else {
               right = right - 1;
            }
        }
        return 0;

    }
}
