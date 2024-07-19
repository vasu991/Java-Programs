package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set  = new HashSet<>();
        for(int i: nums1) {
            set.add(i);
        }
        HashSet<Integer> intersect = new HashSet<>();
        for(int i: nums2) {
            if(set.contains(i)) {
                intersect.add(i);
            }
        }
        int[] ans = new int[intersect.size()];
        int i = 0;
        for(int num: intersect) {
            ans[i] = num;
            i++;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(obj.intersection(nums1, nums2)));
    }
}
