package com.kartik;
import java.util.*;
public class BelowLeftDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the rows of the matrix:");
        int rows  = sc.nextInt();
        System.out.println("enter the columns of the matrix:");
        int columns  = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("enter the matrix");
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j ]= sc.nextInt();

            }
        }
        System.out.println("original matrix:");
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(i>j){
                    System.out.print(arr[i][j] + "\t");
                }
                else {
                    System.out.print("\t\t");
                }
            }
            System.out.println();
        }

    }

}
