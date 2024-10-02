package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayByIncreasingFrequency {
    public static LinkedHashMap<Integer, Integer> frequencySort(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }


        return sortedMap;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,3,2};
        System.out.println(frequencySort(nums));
    }
}
