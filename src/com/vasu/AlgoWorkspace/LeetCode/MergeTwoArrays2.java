package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrays2 {
    int[] nums1 = new int[5];
    int[] nums2 = new int[5];

    public static ArrayList<Integer> merge(int[] arr1, int [] arr2) {
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] > arr2[p2]) {
                arr.add(arr2[p2]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                arr.add(arr1[p1]);
                p1++;
            } else {
                arr.add(arr1[p1]);
                p1++;
                p2++;
            }
        }
        if(p1 == arr1.length) {
            arr.add(arr2[p2]);
        }
        if(p2 == arr2.length) {
            arr.add(arr1[p1]);
        }
        return arr;
     }

    public static void main(String[] args) {
        MergeTwoArrays2 obj = new MergeTwoArrays2();
        obj.nums1 = new int[]{2, 5, 7, 9, 10};
        obj.nums2 = new int[]{1, 3, 6, 8, 9};
        System.out.println(Arrays.toString(new ArrayList[]{merge(obj.nums1, obj.nums2)}));
    }

}
