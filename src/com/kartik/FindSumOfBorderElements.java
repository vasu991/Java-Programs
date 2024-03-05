package com.kartik;
import java.util.*;

public class FindSumOfBorderElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]arr = new int[3][3];
        System.out.println("enter the array");
        for(int i =0;i<arr.length;i++){
            for(int j =0;j< arr.length;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        int sum =0;
        for(int i = 0;i< arr.length;i++){
            sum = sum+ arr[0][i]+arr[arr.length-1][i]+arr[i][0]+arr[i][arr.length-1];
        }//summming first and last rows and columns
        sum = sum - arr[0][0] - arr[0][arr.length-1] - arr[arr.length-1][0] - arr[arr.length-1][arr.length-1];//subtracting corner elements
        System.out.println("SUM:\t"+sum);
    }
}
