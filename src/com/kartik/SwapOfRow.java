package com.kartik;
import java.util.*;
public class SwapOfRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.println("enter the matrix:");
        for(int i =0;i<arr.length;i++){
            for(int j =0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix:");
        for(int i =0;i<arr.length;i++){
            for(int j =0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for(int i =0;i<arr.length;i++){
            int temp = arr[0][i];
            arr[0][i] = arr[2][i];
            arr[2][i] =  temp;
        }
        System.out.println("matrix after row swapping:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
