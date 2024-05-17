package com.vasu.AlgoWorkspace.LeetCode;

import java.util.HashSet;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        HashSet<Character> map = new HashSet<>();
        StringBuilder rev = new StringBuilder(s);
        for(int i = 0; i < vowels.length; i++) {
            map.add(vowels[i]);
        }
        int l = 0;
        int r = s.length() - 1;
        boolean check1 = false;
        boolean check2 = false;
        while(l <= r) {
            while(!map.contains(s.charAt(l))) {
                l++;
                if(l > r) {
                    check1 = true;
                    break;
                }
            }
            if(check1) {
                break;
            }
            while(!map.contains(s.charAt(r))) {
                r--;
                if(l > r) {
                    check2 = true;
                    break;
                }
            }
            if(check2) {
                break;
            }
            char temp = s.charAt(l);
            rev.setCharAt(l, s.charAt(r));
            rev.setCharAt(r, temp);
            l++;
            r--;
        }
        return rev.toString();
    }
    public static void main(String[] args) {
        ReverseVowelsOfAString obj = new ReverseVowelsOfAString();
        System.out.println(obj.reverseVowels("aeiou"));

    }
}
