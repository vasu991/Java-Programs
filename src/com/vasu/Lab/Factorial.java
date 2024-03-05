package com.vasu.Lab;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        int f = 1;
        for(int i = 2; i <= n; i++) {
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        System.out.println("factorial of the number: " + fact(num));
    }
}
