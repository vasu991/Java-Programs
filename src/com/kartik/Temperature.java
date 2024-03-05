package com.kartik;
import java.util.*;


public class Temperature {
    double max ,f1;
    double min,f2;
    Temperature(double m, double n){
        max = m;
        min = n;

        }
    void compute(){
        f1= 9*max/5+32;
        f2= 9*min/5+32;
    }
    void display() {
        System.out.println("the maximum temperature in farenheit:" + f1);
        System.out.println("the minimum temperaturein farenheit" + f2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double t1,t2;
        System.out.println("enter maximum and minimum temperature in celsius:");
        t1 = sc.nextDouble();
        t2 = sc.nextDouble();
        Temperature ob = new Temperature(t1,t2); // ob.max = t1, ob.min = t2
        ob.compute();
        ob.display();
        System.out.println(ob.min);
    }
}
