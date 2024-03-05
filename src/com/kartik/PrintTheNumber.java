package com.kartik;import java.util.*;


public class PrintTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a single digit number:");
        int origanal = sc.nextInt();
        int c = origanal;
        c = c/10;
        if(c != 0) {
            System.out.println("wrong input!!");
            return;
        }
        String s = String.valueOf(origanal);
        int n1 = Integer.valueOf(s+s);
        int n2 = Integer.valueOf(s+s+s);
        int n3 = Integer.valueOf(s+s+s+s);

        int sum = n1 + n2 + n3;
        System.out.println("number 1: " + n1);
        System.out.println("number 2: " + n2);
        System.out.println("number 3: " + n3);
        System.out.println("Sum: " + sum);

    }


}
