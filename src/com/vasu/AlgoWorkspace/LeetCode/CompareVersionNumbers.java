package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        List<String> v1 =
                new ArrayList<String>(Arrays.asList(version1.split("\\.")));
        List<String> v2 =
                new ArrayList<String>(Arrays.asList(version2.split("\\.")));

        int diff = v1.size() - v2.size();

        if(diff > 0) {
            for(int i = 0; i < diff; i++) {
                v2.add("0");
            }
        }
        else if (diff < 0) {
            for(int i = 0; i < (-diff); i++) {
                v1.add("0");
            }
        }

        System.out.println(v1);
        System.out.println(v2);

        for(int i = 0; i < v1.size(); i++) {
            String rv1 = v1.get(i);
            String rv2 = v2.get(i);
            int p1 = 0, p2 = 0;

            for (int j = 0; j < rv1.length() - 1; j++) {
                if(rv1.charAt(j) == 0) {
                    p1++;
                }
            }

            for (int j = 0; j < rv2.length() - 1; j++) {
                if(rv2.charAt(j) == 0) {
                    p2++;
                }
            }


            int revison1 = Integer.parseInt(rv1.substring(p1));
            int revison2 = Integer.parseInt(rv2.substring(p2));
            System.out.print(revison1 + " " + revison2);
            System.out.println();
            if(revison1 > revison2) {
                return 1;
            }
            else if (revison1 < revison2){
                return -1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        CompareVersionNumbers obj = new CompareVersionNumbers();
        System.out.println(obj.compareVersion("0001.01.", "0001.01.000"));

    }
}
