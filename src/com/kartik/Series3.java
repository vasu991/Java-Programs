package com.kartik;
import java.util.*;
public class Series3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and n:");
        int a = sc.nextInt();
        int n = sc.nextInt();
        int c = 0;
         for(int i =0; i<=2*n; i=i+2){
             double term = Math.pow(a,i);
             if(c%2 == 0) {
                 System.out.print(term +" + ");
             }
             else  {
                 System.out.print(term + " - ");
             }
             c++;
         }
    }
}
