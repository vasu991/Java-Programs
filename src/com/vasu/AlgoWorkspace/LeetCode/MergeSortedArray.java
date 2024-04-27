package com.vasu.AlgoWorkspace.LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    static int[] nums1 = new int[]{0};
    static int[] nums2 = new int[]{1};
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = 0;
        int second = 0;
        int[] copy = new int[nums1.length];
        System.arraycopy(nums1, 0, copy, 0, nums1.length);
        for(int i = 0; i < (m+n); i++) {
            if(nums2.length == 0) {
                break;
            }
            if(second > n-1) {
                nums1[i] = copy[first];
                first++;
                continue;
            }
            if(first > m-1) {
                nums1[i] = nums2[second];
                second++;
                continue;
            }
            if(copy[first] > nums2[second]) {
                nums1[i] = nums2[second];
                second++;
            }
            else {
                nums1[i] = copy[first];
                first++;
            }
        }
    }
    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1, Math.abs(nums1.length - nums2.length), nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }
}
