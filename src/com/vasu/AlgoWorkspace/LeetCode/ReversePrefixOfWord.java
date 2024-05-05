package com.vasu.AlgoWorkspace.LeetCode;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int i;
        for(i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                break;
            }
        }

        if(i == 0 || i == word.length()) {
            return word;
        }
        if(i == word.length() - 1) {
            return reverse(word);
        }

        String pre = word.substring(0, i+1);
        String revPre = reverse(pre);
        String rev;
        rev = revPre + word.substring(i+1);

        return rev;

    }

    public static String reverse(String str) {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev.concat(String.valueOf(str.charAt(i)));
        }

        return rev;
    }

    public static void main(String[] args) {

        ReversePrefixOfWord obj = new ReversePrefixOfWord();
        System.out.println(obj.reversePrefix("abcd", 'z'));

    }

}
