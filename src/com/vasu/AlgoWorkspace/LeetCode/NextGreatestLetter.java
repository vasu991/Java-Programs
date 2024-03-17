package com.vasu.AlgoWorkspace.LeetCode;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length-1] < target) {
            return letters[0];
        }
        int l = 0;
        int r = letters.length-1;
        int mid = 0;
        while(l < r) {
            mid = l + (r - l) / 2;
            if(letters[mid] > target) {
                r = mid;
            }
            else if(letters[mid] < target) {
                l = mid;
            }
            else {
                return letters[mid+1];
            }
        }
        return letters[mid];
    }

    public static void main(String[] args) {
        NextGreatestLetter obj = new NextGreatestLetter();
        char[] letters = {'c', 'f', 'j'};
        char target = 'd';
        char ans = obj.nextGreatestLetter(letters, target);
        System.out.println(ans);

    }
}
