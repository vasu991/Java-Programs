package com.kartik;
import java.util.*;

public class FindVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the path of the program:");
        System.out.println("1. volume of cone.");
        System.out.println("2. volume of cylinder.");
        System.out.println("3. volume of sphere.");
        int flow = sc.nextInt();

        switch (flow){
            case 1:
                System.out.println("enter the radius and height of cone");
                double r = sc.nextDouble();
                double h = sc.nextDouble();
                double volume = (1.0/3.0)*Math.PI*r*r*h;
                System.out.println("volume of cone: "+ volume);
                break;
            case 2:
                System.out.println("enter the radius and height of cylinder");
                double r1 = sc.nextDouble();
                double h1 = sc.nextDouble();
                double volume1  = Math.PI*r1*r1*h1;
                System.out.println("volume of cylinder :"+ volume1);
                break;
            case 3:
                System.out.println("enter the radius of sphere");
                double r2 = sc.nextDouble();
                double volume2= (4.0/3.0)*Math.PI*r2*r2*r2;
                System.out.println("volume of sphere: "+ volume2);
                break;
            default:
                System.out.println("wrong input!!");

        }
    }
}
