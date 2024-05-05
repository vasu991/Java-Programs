package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class TheKthFactorOfN {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);

        for(int i = 2; i <= (n/2); i++) {
            if(n % i == 0) {
                arr.add(i);
            }
        }
        arr.add(n);
        System.out.println(Arrays.toString(new ArrayList[]{arr}));
        if(arr.size() < k) {
            return -1;
        }

        return arr.get(k-1);

    }

    public static void main(String[] args) {
        TheKthFactorOfN obj = new TheKthFactorOfN();
        System.out.println(obj.kthFactor(4, 4));
    }
}
