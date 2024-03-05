package com.kartik;
import java.util.*;
public class LGDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter microwave mrp");
        double micro = sc.nextDouble();
        System.out.println("enter air conditioner mrp");
        double ac = sc.nextDouble();
        System.out.println("enter television mrp ");
        double tv = sc.nextDouble();
        System.out.println("discounted price of microwave: " + price(micro, 10));
        System.out.println("discounted price of air conditioner: " + price(ac, 12));
        System.out.println("discounted price of television: " + price(tv, 15));


    }
    public static double price(double mrp,double disPercent){
        double price = ((100-disPercent)/100)*mrp;
        return price;
    }



}
