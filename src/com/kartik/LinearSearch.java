package com.kartik;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[]arr = new int[5];
        System.out.println("enter the array:");
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the targeted element:");
       int target = sc.nextInt();
       for(int i =0;i<arr.length;i++){
           if(arr[i] == target){
               System.out.println("target found at "+i+" index.");
               return;
           }

       }
        System.out.println("target not found");

    }
}
