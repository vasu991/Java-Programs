package com.vasu.AlgoWorkspace.LeetCode;

import java.util.HashMap;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        int[] T = new int[38];
        T[0] = 0;
        T[1] = 1;
        T[2] = 1;

        if(n < 3) {
            return T[n];
        }

        HashMap<Integer, Integer> mem = new HashMap<>();
        mem.put(0, 0);
        mem.put(1, 1);
        mem.put(2, 1);


        for (int i = 3; i <= n; i++) {

            T[i] = mem.get(i-1) + mem.get(i-2) + mem.get(i-3);
            mem.put(i, T[i]);
        }

        return T[n];
    }
    public static void main(String[] args) {
        NthTribonacciNumber obj = new NthTribonacciNumber();
        System.out.println(obj.tribonacci(25));

    }
}
