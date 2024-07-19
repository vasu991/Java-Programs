package com.vasu.AlgoWorkspace.LeetCode;

public class SearchInRotatedSortedArray {

        public static int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                // Check if the left side is sorted
                if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    // Otherwise, the right side must be sorted
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return -1; // Target not found
        }



    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 5;
        System.out.println(search(nums, target));
    }
}
