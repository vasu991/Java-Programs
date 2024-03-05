package com.kartik;
import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the mrp:");
        int mrp = sc.nextInt();
        double dp = ((double) 85 /100)*(double)mrp;
        System.out.println("discounted price:"+dp);
    }
}
