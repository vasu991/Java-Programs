package com.vasu.AlgoWorkspace.LeetCode;

public class BeautifulTowersI {
    public long maximumSumOfHeights(int[] heights) {
        int peak = findPeak(heights);
        long sum = heights[peak];
        if(peak != 0)  {
            sum = sum + heights[peak-1];
        }
        if(peak != heights.length-1)  {
            sum = sum + heights[peak+1];
        }

        for(int i = peak-2; i >= 0; i--) {
            heights[i] = Math.min(heights[i], heights[i+1]);
            sum = sum + heights[i];
        }

        for(int i = peak+2; i < heights.length; i++) {
            heights[i] = Math.min(heights[i], heights[i-1]);
            sum = sum + heights[i];
        }

        return sum;
    }

    public int findPeak(int[] heights) {
        int peak = heights[0];
        int index = 0;
        for(int i = 0 ; i < heights.length; i++) {
            if(heights[i] > peak) {
                peak = heights[i];
                index = i;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        BeautifulTowersI obj = new BeautifulTowersI();
        int[] heights = {2,4,5,2,5,5,2,1,1,3};
        System.out.println(obj.maximumSumOfHeights(heights));

    }
}
