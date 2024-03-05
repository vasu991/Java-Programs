package com.kartik;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("The Pattern");
        int k = 0;
        for(int i =1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
        k = 5;
        for(int i=3;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(k+ " ");
                k--;
            }
            System.out.println();
        }

    }
}
