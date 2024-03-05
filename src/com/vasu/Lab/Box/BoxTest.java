package com.vasu.Lab.Box;

import java.util.*;
public class BoxTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the box:");
        double len = sc.nextDouble();
        System.out.println("Enter the width of the box:");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the box:");
        double height = sc.nextDouble();
        Box b1 = new Box(len, width, height);
        double result = b1.volume();
        System.out.println("Volume of Box " + result);
        sc.close();
    }

}