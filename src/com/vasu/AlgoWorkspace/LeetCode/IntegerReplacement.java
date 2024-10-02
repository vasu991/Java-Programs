package com.vasu.AlgoWorkspace.LeetCode;

import java.util.HashMap;

public class IntegerReplacement {
    public static HashMap<Long, Long> mem = new HashMap<>();
    public static int integerReplacement(int n) {
        return (int)helper(n);
    }

    public static long helper(long n) {
        if(n <= 1) {
            return 0;
        }
        if(mem.containsKey(n)) {
            return mem.get(n);
        }
        else {
            long solN;
            if(n % 2 == 0) {
                solN = helper(n / 2) + 1;
            }
            else {
                solN = Math.min(helper(n + 1), helper(n - 1)) + 1;
            }
            mem.put(n, solN);
            return solN;
        }
    }
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println(integerReplacement(n));
    }
}
