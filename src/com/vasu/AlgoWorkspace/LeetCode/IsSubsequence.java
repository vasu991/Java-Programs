package com.vasu.AlgoWorkspace.LeetCode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int ptr1 = 0, ptr2 = 0;
        while(ptr2 < t.length()) {
            if(ptr1 > s.length() - 1) {
                break;
            }
            if(s.charAt(ptr1) == t.charAt(ptr2)) {
                ptr1++;
                ptr2++;
            }
            else {
                ptr2++;
            }
        }
        if(ptr1 > s.length() - 1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        IsSubsequence obj = new IsSubsequence();
        System.out.println(obj.isSubsequence("axc", "ahbgdc"));
    }
}
