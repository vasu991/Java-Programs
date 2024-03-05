package com.kartik;
import java.util.*;


public class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = sc.nextInt();
        printSeries(n);


    }
    public static void  printSeries(int n){
        for(int i = 1; i<=n; i++){
            System.out.print("(");
            for(int j = 1; j<=i; j++){
                if(j == i) {
                    System.out.print(j);
                }
                else {
                    System.out.print(j+"+");
                }
            }
            if(i == n) {
                System.out.print(")");
            }
            else {
                System.out.print(")+");
            }
        }

    }


}
