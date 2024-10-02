package com.vasu.AlgoWorkspace.LeetCode;

import java.util.HashMap;

public class MinimumLengthOfStringAfterOperations {
    public static int minimumLength(String s) {
        if(s.length() < 3) {
            return s.length();
        }
        StringBuilder str = new StringBuilder(s);
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            }
            else {
                map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        for(int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) > 2) {

            }
        }
        for(int i = 1; i < str.length(); i++) {
            int l = i - 1;
            int r = i + 1;
            boolean flag = false;
            while(l >= 0 && r < str.length()) {
                if (str.charAt(l) == str.charAt(i) && str.charAt(r) == str.charAt(i)) {
                    flag = true;
                    break;
                }
                if (str.charAt(l) != str.charAt(i)) {
                    l--;
                }
                if (str.charAt(r) != str.charAt(i)) {
                    r++;
                }
            }
            if(flag)  {
                map.replace(str.charAt(i), map.get(str.charAt(i)) - 2);
                str.deleteCharAt(l);
                str.deleteCharAt(r-1);
            }

        }
        System.out.println(str);
        return str.length();
    }
    public static void main(String[] args) {
        String s = "ucvbutgkohgbcobqeyqwppbxqoynxeuuzouyvmydfhrprdbuzwqebwuiejoxsxdhbmuaiscalnteocghnlisxxawxgcjloevrdcj";
        System.out.println(minimumLength(s));

    }
}
