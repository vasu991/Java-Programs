package com.kartik;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
//        System.out.println("GCD: " + gcd(24, 40));

    }
    public static int gcd(int a, int b){
       int gcd = Math.min(a,b)  ;
       while(gcd > 0){
           if(a%gcd == 0 && b%gcd== 0 ){
               break;
           }
           gcd--;
       }

       return gcd;

    }
}
