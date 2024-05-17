package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //|a - x| < |b - x|, or
        //|a - x| == |b - x| and a < b
        List<Integer> ans = new ArrayList<>();
        if(arr.length == 1) {
            ans.add(arr[0]);
            return ans;
        }
        int index = findClosest(arr, x);
        System.out.println(index);
        int l;
        int r;
        if(index == 0 || index == arr.length - 1) {
            if(index == 0) {
                if(Math.abs(arr[index] - x) > Math.abs(arr[index+1] - x)) {
                    index++;
                }
            }
            if(index == arr.length - 1) {
                if(Math.abs(arr[index] - x) >= Math.abs(arr[index-1] - x)) {
                    index--;
                }
            }
         }
        else {
            if(Math.abs(arr[index] - x) >= Math.abs(arr[index-1] - x)) {
                index--;
            }
            if(Math.abs(arr[index+1] - x) < Math.abs(arr[index] - x)) {
                index++;
            }
        }

        if(k == 1) {
            ans.add(arr[index]);
            return ans;
        }
        l = Math.max((index - k + 1), 0);
        r = Math.min((index + k + 1), arr.length - 1);
        System.out.println(l + " " + r);
        while((r - l + 1) > k) {
            if(Math.abs(arr[l] - x) > Math.abs(arr[r] - x)) {
                l++;
            }
            else {
                r--;
            }

        }

        for(int i = l; i <= r; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }

    public static int findClosest(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int mid = 0;
        while(l <= r) {
            mid = l + (r - l)/2;
            int diff = target - arr[mid];

            if(diff > 0) {
                l = mid + 1;
            }
            else if(diff < 0) {
                r = mid - 1;
            }
            else {
                break;
            }
        }

        return mid;

    }
     public static void main(String[] args) {
        int[] arr = {3, 6, 7, 15, 16, 18};
        FindKClosestElements obj = new FindKClosestElements();
        System.out.println(findClosest(arr, 14));
//        System.out.println(obj.findClosestElements(arr, 1,9));

    }
}
