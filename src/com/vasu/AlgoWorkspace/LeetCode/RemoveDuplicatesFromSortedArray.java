package com.vasu.AlgoWorkspace.LeetCode;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));



    }

    public static int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 1;
        int ctr = 1;
        int i = 1;
        while(r < nums.length) {
            if(nums[l] != nums[r]) {
                nums[i] = nums[r];
                l = r;
                r = r + 1;
                ctr++;
                i++;
            }
            else {
               r = r + 1;
            }

        }
        return ctr;

    }
}
