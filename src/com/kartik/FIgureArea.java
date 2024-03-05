package com.kartik;

import java.util.Scanner;

public class FIgureArea {
    public static int l, s1, s2, b, h;
    public static double d1, d2;

    public static void main(String[] args) {
        input();
        System.out.println("Area of paralleogram:" + area(l, b));
        System.out.println("Area of rhombus:" + area(d1, d2));
        System.out.println("Area of trapezium:" + area(s1, s2, h));

    }
    public static int area(int l, int b) {
        return l*b;
    }
    public static double area(double d1, double d2) {
        double a = 0.5*(d1*d2);
        return a;
    }
    public static double area(int s1, int s2, int h) {
        double c = 0.5*((double)((s1+s2)*h));
        return c;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of breath and length:");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the values of diagonals:");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        System.out.println("Enter the values of two parallel sides and height of the tarpazium:");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        h = sc.nextInt();
    }
}
