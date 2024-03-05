package com.kartik;
import java.util.*;

public class SumOfElementsExceptLEftDiagnoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ;
        int[][]arr = new int [3][3];
        System.out.println("enter the array");
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                arr[i][j]= sc.nextInt();

            }

        }
        int sum =0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(i!=j){
                    sum = sum+arr[i][j];

                }
            }

        }
        System.out.println("sum of elements except left diagonal:\t"+sum);
    }
}
