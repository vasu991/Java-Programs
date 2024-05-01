package com.vasu.AlgoWorkspace.LeetCode;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        s = s.trim();
        if(s.length() == 1) {
            return s;
        }
        String rev = "";
        int p1 = s.length() - 2;
        int p2 = s.length() - 1;
        boolean check = true;

        while(p1 >= 0) {
            if(s.charAt(p1) == ' ' || p1 == 0) {
                if(check || p1 == 0) {
                    if(p1 == 0) {
                        rev = rev.concat(s.substring(p1, p2+1));
                    }
                    else {
                        rev = rev.concat(s.substring(p1+1, p2+1));
                        rev = rev.concat(" ");
                    }
                    check = false;
                }
                p2 = p1;
                p2--;
            }
            else {
                check = true;
            }
            p1--;
        }
        return rev;
    }
    public static void main(String[] args) {
        ReverseWordsInAString obj = new ReverseWordsInAString();
        String s = "a  good   example";
        System.out.println(obj.reverseWords(s));

    }
}
