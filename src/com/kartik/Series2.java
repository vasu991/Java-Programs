package com.kartik;
import java.util.*;

public class Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a & n:");
        int a = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            double term = Math.pow(a,i);
            if(i == n-1) {
                System.out.print(term);
            }
            else {
                System.out.print(term +" + ");
            }
        }

    }

}
