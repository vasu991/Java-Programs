package com.vasu.Lab;

import java.util.Scanner;

public class Prime {
    public static boolean prime(int p){
        if (p <= 1)
            return false;

        // Check from 2 to n-11
        for (int i = 2; i < p; i++)
            if (p % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        if (prime(num)) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
}
