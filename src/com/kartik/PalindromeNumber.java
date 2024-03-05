package com.kartik;

import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc .nextInt();
        int rev = 0;
        int z = n;
        while(n > 0){
            int r = n%10;
            rev = (rev + r)*10;
            n = n /10;
        }
        rev = rev/10;
        System.out.println("Reverse Number: "+rev);

    }
}