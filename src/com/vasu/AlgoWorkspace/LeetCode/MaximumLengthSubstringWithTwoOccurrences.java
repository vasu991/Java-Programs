package com.vasu.AlgoWorkspace.LeetCode;

import java.util.HashMap;

public class MaximumLengthSubstringWithTwoOccurrences {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> origMap = new HashMap<>();
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!origMap.containsKey(s.charAt(i))) {
                origMap.put(s.charAt(i), 1);
            }
            else {
                origMap.replace(s.charAt(i), origMap.get(s.charAt(i)) + 1);
            }
         }

        int l = 0;
        int r = 1;

        return 0;

    }

    public static void main(String[] args) {

    }
}
