package com.kartik;
import java.util.*;

public class BonusDeterminator {
    public static void main(String[] args) {
        // income > 100000 && income <= 200000,  bonus = 10%
        // income > 200000,  bonus  = 15%
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the income:");
        int income = sc.nextInt();
        int bonus;
        if(income>100000 && income<200000) {
            bonus = 10;

        }
        else{
            bonus = 15;
        }
        income = income + ((bonus*income)/100);
        System.out.println("revised income: " + income);
        System.out.println("bonus: " + bonus);
    }
}
