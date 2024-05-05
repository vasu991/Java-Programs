package com.vasu.AlgoWorkspace.LeetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int n = x;
        int rev = 0;
        int i = digits(n) - 1;

        while(x > 0) {
            int r = x % 10;
            rev = rev + (int) Math.pow(10, i)*r;
            System.out.println(rev);
            i--;
            x = x/10;
        }


        if(n == rev) {
            return true;
        }

        return false;

    }

    public static int digits(int x) {
        int count = 0;
        while(x > 0) {
            count++;
            x = x/10;
        }

        return count;
    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        System.out.println(obj.isPalindrome(10));

    }
}
