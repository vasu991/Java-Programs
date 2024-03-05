package com.kartik;
import java.util.*;

public class ShopSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("enter the shop number and floor number");
        int shop = sc.nextInt();
        int floor = sc.nextInt();
        System.out.println("enter sales of each shop");
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
               if(i==floor && j==shop) {
                   System.out.println(arr[i][j]);
                   break;
               }
            }
        }
    }
}
