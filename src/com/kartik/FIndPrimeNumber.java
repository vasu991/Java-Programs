package com.kartik;
import java.util.*;

public class FIndPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
          for(int i =2;i<num/2;i++){
              if(num % i == 0){
                  System.out.println("not a prime number");
                  return;
              }
          }

        System.out.println("prime number!!");

        }
}

