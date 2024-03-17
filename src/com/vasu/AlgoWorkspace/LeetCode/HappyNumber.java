package com.vasu.AlgoWorkspace.LeetCode;
class HappyNumber {
   public boolean isHappy(int n) {
       int slow = n;
       int fast = n;

       do{
           slow = numSq(slow);
           fast = numSq(numSq(fast));
       } while(slow != fast);

       if (slow == 1) {
           return true;
       }
       return false;

   }

   public int numSq(int n) {
       int num = 0;
       while(n > 0) {
           int r = n%10;
           int sq = (int) Math.pow(r, 2);
           num = num + sq;
           n = n/10;
       }
       return num;

   }

}