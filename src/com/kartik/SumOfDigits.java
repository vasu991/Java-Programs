package com.kartik;
import java.util.*;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            int a = num%10;
            sum = sum + a;
            num = num/10;


        }
        System.out.println(sum);

    }
}
