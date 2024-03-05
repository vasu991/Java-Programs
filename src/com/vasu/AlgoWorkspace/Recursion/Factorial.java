package com.vasu.AlgoWorkspace.Recursion;

public class Factorial {

    public static void main(String[] args) {
        int factorial = fact(10);
        System.out.println(factorial);
    }

    public static int fact(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return fact(n-1)*n;
        }
    }
}
