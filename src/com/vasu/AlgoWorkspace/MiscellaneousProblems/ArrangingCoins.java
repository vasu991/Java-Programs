package com.vasu.AlgoWorkspace.MiscellaneousProblems;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(2147483647));

    }

    public static int arrangeCoins(int n) {
        long sum = 0;
        int stairs = 0;
        while(sum < n) {
            ++stairs;
            sum = sum + stairs;

        }
        if(sum - n == 0) return stairs;
        else return stairs - 1;
    }
}

