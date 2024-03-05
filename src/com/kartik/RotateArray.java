package com.kartik;
import java.util.*;
public class RotateArray {
    static int [] arr = new int[5];
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the array:");

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter how many times you want to rotate the array:");
        int d = sc.nextInt();
        for(int i = 0; i<d; i++) {
            leftRotate(arr);
        }
        print();


    }
    public static void leftRotate(int[]arr){
        int temp, i;
        temp = arr [0];
        for(i =0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i] = temp;
     }

     public static void print() {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
     }
}
