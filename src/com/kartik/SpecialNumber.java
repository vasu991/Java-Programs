package com.kartik;
import java . util.*;
public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while(num>0) {
            int rem = num%10;
            int fact = factorial(rem);
            sum = sum + fact;
            num = num/10;
        }
        if(n==sum){
            System.out.println("special number");
        }
        else {
            System.out.println("not a special number");
        }

        }
        public static int factorial(int num){
        int fact = 1;
        for(int i = 2;i<=num;i++){
            fact = fact*i;
           }
        return fact;
        }
    }

