package com.vasu.AlgoWorkspace.Recursion;

public class isPowerofFour {
    public static boolean four(int n) {
        int rem = n%4;
        if(rem == 0) {
            return true;
        }
        else {
            return four(n/4);
        }

    }
    public static void main(String[] args) {
        System.out.println(four(-2147483648));

    }

}
