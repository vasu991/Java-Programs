package com.kartik;
import java.util.*;
public class ArrayInsertion {
    static int[] arr =new int[50];
    static int size;
    public static void insert (int[] arr,int value,int pos){
        for(int i = size-1;i>=pos;i--){
            arr[i+1] = arr[i];

        }
        arr[pos] = value;
        size++;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5; // [1, 2, 3, 4, 5]
        size = 5;
        System.out.println("enter the value:");
        int value = sc.nextInt();
        System.out.println("enter the position:");
        int pos = sc.nextInt();
        insert(arr, value, pos); // [1 2 10 3 4 5]
        insert(arr, 11, 3); // [1 2 10 11 3 4 5]
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
