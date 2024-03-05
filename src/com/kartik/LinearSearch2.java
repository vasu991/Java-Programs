package com.kartik;
import java.util.*;
public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the array:");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("enter the number to be searched:");
        int n = sc.nextInt();
        for(int i =0;i<arr.length;i++){
            if(n == arr[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Not found!!");
    }
}
