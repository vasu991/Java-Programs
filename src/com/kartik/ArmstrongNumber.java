package com.kartik;
import java .util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while (n>0){
            int cube = (int) Math.pow(rem(n),3);
            sum = sum+cube;
            n = n/10;
        }
        if(num==sum) {
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
    public static int rem(int num){
        return num%10;
    }
}
