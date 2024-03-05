package com.kartik;
import java .util.*;

public class ProductOfDigits {
    public static void main(String[] args) {
        //n = 256 pro = 2*5*6
        Scanner sc = new Scanner (System.in);
        int product = 1;
        System.out.println("enter the number");
        int num = sc.nextInt();
        while(num > 0){
            int r = num%10;
            product = product * r;
            num = num/10;
        }

        System.out.println(product);

    }

}
