package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class ClimbingStairs {
    HashMap<Integer, Integer> steps = new HashMap<>();

    public int climbStairs(int n) {
        if(n < 1) {
            steps.put(0, 1);
            return 1;
        }
        if(n == 1) {
            steps.put(1, 1);
            return 1;
        }
        if(steps.containsKey(n-1) && steps.containsKey(n-2)) {
            return steps.get(n-1) + steps.get(n-2);
        }
        else {
            int curr = climbStairs(n-1) + climbStairs(n-2);
            steps.put(n, curr);
            return curr;
        }

    }
    public static void main(String[] args) {
        ClimbingStairs obj = new ClimbingStairs();
        System.out.println( obj.climbStairs(47));
        System.out.println(obj.steps);
    }
}
