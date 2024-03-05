package com.kartik;

import java.util.*;
public class LS {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int[]arr = new int[5];
        System.out.println("enter the array:");
        for(int i =0;i<arr.length;i++){
            arr [i] = sc .nextInt();

        }
        System.out.println("enter the elemnt to be search:");
        num = sc.nextInt();
        for(int i =0;i<arr.length;i++){

            if(num == arr[i]){
                System.out.println("element found at "+i+" index.");
                break;
            }

        }


    }

}
