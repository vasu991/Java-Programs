package com.vasu.AlgoWorkspace.MiscellaneousProblems;

import java.util.Scanner;

public class Sqrtx {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;
        int mid = 0;
        int last = 0;
        while(l <= r) {
            mid = l + (r-l)/2;
            int sq = mid*mid;
            if(sq > x) {
                l = mid+1;
            }
            else if(sq < x) {
                r = mid - 1;
            }
            else {
                return mid;
            }

        }
        return mid;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        Sqrtx obj = new Sqrtx();
        System.out.println(obj.mySqrt(x));
    }
}
