package com.vasu.AlgoWorkspace.LeetCode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));

    }

    public static int strStr(String haystack, String needle) {
        int ptr1 = 0;
        int ptr2 = 0;
        while(ptr1 < haystack.length()) {
            if(ptr2 == needle.length()-1) {
                return ptr1 - needle.length() + 1;
            }
            if(haystack.charAt(ptr1) == needle.charAt(ptr2)) {
                ptr1++;
                ptr2++;
            }
            else {
                ptr1++;
                ptr2 = 0;
            }
        }

        return -1;

    }
}
