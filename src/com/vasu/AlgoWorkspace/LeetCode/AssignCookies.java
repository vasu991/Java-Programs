package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        ArrayList<Integer> greed = new ArrayList<>();
        ArrayList<Integer> size = new ArrayList<>();

        for (int j : g) {
            greed.add(j);
        }

        for (int j : s) {
            size.add(j);
        }

        greed.sort(Collections.reverseOrder());
        size.sort(Collections.reverseOrder());

        int ps = 0;
        int pg = 0;
        int count = 0;


        while(ps < size.size() && pg < greed.size()) {
            if(size.get(ps) >= greed.get(pg)) {
                pg++;
                ps++;
                count++;
            }
            else {
                pg++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] g = {3, 4, 5, 12};
        int[] s = {4, 5, 7};
        System.out.println(findContentChildren(g, s));

    }
}
