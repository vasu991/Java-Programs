package com.vasu.AlgoWorkspace.MiscellaneousProblems;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static ArrayList<Integer> newNums = new ArrayList<>();
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(new ArrayList[]{newNums}));



    }

    public static int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 1;
        int ctr = 1;
        newNums.add(nums[0]);

        while(r < nums.length) {
            if(nums[l] != nums[r]) {
                newNums.add(nums[r]);
                l = r;
                r = r + 1;
                ctr++;

            }
            else {
               r = r + 1;
            }

        }
        return ctr;

    }
}
