package com.kartik;
import java.util.*;


public class CheckPrime {
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter  the number: ");
        num = sc.nextInt();
        isPrime();
    }
    public static void isPrime(){
        boolean check = true;
        for( int i = 2;i<=(num/2);i++){
            if(num%i == 0) {
                System.out.println("number is not prime");
                check = false;
                break;
            }
        }
        if(check) {
            System.out.println("prime number");
        }

    }
}
